package irvine.oeis.a045;
// manually 2021-03-01

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;
import irvine.oeis.a008.A008905;

/**
 * A045509 Factorials having initial digit '1'.
 * @author Georg Fischer
 */
public class A045509 extends Sequence1 {

  protected Z mDig1;
  protected int mN;
  protected Sequence mSeq;
  protected Sequence mSeq2;
  
  /** Construct the sequence. */
  public A045509() {
    this(1);
  }

  /**
   * Generic constructor for similar sequences.
   * @param dig1 digit
   */
  public A045509(final int dig1) {
    mDig1 = Z.valueOf(dig1);
    mSeq = new A008905();
    mSeq2 = new A000142();
    mN = -1;
    if (dig1 == 1) {
      ++mN;
      mSeq.next();
      mSeq2.next();
    }
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z first = mSeq.next();
      final Z fact = mSeq2.next();
      if (first.equals(mDig1)) {
        return fact;
      }
    }
  }
}
