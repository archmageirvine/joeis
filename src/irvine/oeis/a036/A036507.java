package irvine.oeis.a036;
// manually, 2020-11-04

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000290;
import java.util.TreeMap;

/**
 * A036507 Smallest square containing exactly n 0's.
 * @author Georg Fischer
 */
public class A036507 implements Sequence {

  protected Sequence mSeq; // underlaying sequence
  protected int mDigit; // the specific digit to be counted
  protected int mN; // current number
  protected TreeMap<Integer, Z> mElemNDig; // numbers which contain so many of the specified digit as the index tells

  /** Construct the sequence. */
  public A036507() {
    this(1, new A000290(), 0);
  }
  
  /**
   * Constructor with parameters
   * @param offset offset1 of th resulting sequence
   * @param seq underlaying sequence
   * @param digit the specific digit to be counted
   */
  protected A036507(final int offset, final Sequence seq, final int digit) {
    mSeq = seq;
    mDigit = digit;
    mN = offset - 1;
    mElemNDig = new TreeMap<Integer, Z>(); // preset with null
  }

  @Override
  public Z next() {
    ++mN;
    Z result = mElemNDig.get(new Integer(mN));
    boolean busy = result == null;
    while (busy) {
      Z square = mSeq.next();
      final int count = ZUtils.digitCounts(square)[mDigit];
      if (mElemNDig.get(new Integer(count)) == null) {
        mElemNDig.put(new Integer(count), square);
        if (count == mN) {
          result = square;
          busy = false;
        }
      }
    } // while busy   
    return result;
  }
  
}
