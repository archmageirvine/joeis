package irvine.oeis.a048;
// manually, 2021-04-30

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000290;

/**
 * A048345 a(n)^2 is the smallest square containing exactly n 0's.
 * Copied from A036507.
 * @author Georg Fischer
 */
public class A048345 extends AbstractSequence {

  protected Sequence mSeq; // underlying sequence
  protected int mDigit; // the specific digit to be counted
  protected int mN; // current index
  protected int mK; // index in underlying sequence
  protected TreeMap<Integer, Integer> mElemNDig; // numbers which contain so many of the specified digit as the index tells

  /** Construct the sequence. */
  public A048345() {
    this(1, new A000290(), 0);
  }

  /**
   * Constructor with parameters
   * @param offset offset of the resulting sequence
   * @param seq underlying sequence
   * @param digit the specific digit to be counted
   */
  protected A048345(final int offset, final Sequence seq, final int digit) {
    super(offset);
    mSeq = seq;
    mDigit = digit;
    mN = offset - 1;
    mK = mN >= 0 ? mN - 1 : mN;
    mElemNDig = new TreeMap<>(); // preset with null
  }

  @Override
  public Z next() {
    final Integer res = mElemNDig.get(++mN);
    if (res != null) {
      return Z.valueOf(res.intValue());
    }
    while (true) {
      ++mK;
      final Z square = mSeq.next();
      final int count = ZUtils.digitCounts(square)[mDigit];
      if (count == mN) {
        return Z.valueOf(mK);
      }
      mElemNDig.putIfAbsent(count, mK);
    } // while
  }
}
