package irvine.oeis.a036;
// manually, 2023-07-03

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000290;

/**
 * A036508 Smallest square containing exactly n 1's.
 * @author Georg Fischer
 */
public class A036508 extends AbstractSequence {

  protected Sequence mSeq; // underlying sequence
  protected int mDigit; // the specific digit to be counted
  protected int mN; // current number
  protected TreeMap<Integer, Z> mElemNDig; // numbers which contain so many of the specified digit as the index tells

  /** Construct the sequence. */
  public A036508() {
    this(1, new A000290(), 1);
  }

  /**
   * Constructor with parameters
   * @param offset offset of the resulting sequence
   * @param seq underlying sequence
   * @param digit the specific digit to be counted
   */
  protected A036508(final int offset, final Sequence seq, final int digit) {
    super(offset);
    mSeq = seq;
    mDigit = digit;
    mN = offset - 1;
    mElemNDig = new TreeMap<>(); // preset with null
  }

  @Override
  public Z next() {
    final Z res = mElemNDig.get(++mN);
    if (res != null) {
      return res;
    }
    while (true) {
      final Z square = mSeq.next();
      final int count = ZUtils.digitCounts(square)[mDigit];
      if (count == mN) {
        return square;
      }
      mElemNDig.putIfAbsent(count, square);
    } // while
  }

}

