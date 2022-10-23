package irvine.oeis.a045;
// manually 2021-03-01

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008905;

/**
 * A045520 Numbers k such that k! has initial digit '1'.
 * @author Georg Fischer
 */
public class A045520 extends Sequence1 {

  protected Z mDig1;
  protected int mN;
  protected Sequence mSeq;
  
  /** Construct the sequence. */
  public A045520() {
    this(1);
  }

  /**
   * Generic constructor for similar sequences.
   * @param dig1 initial digit
   */
  protected A045520(final int dig1) {
    mDig1 = Z.valueOf(dig1);
    mSeq = new A008905();
    mN = -1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z first = mSeq.next();
      if (first.equals(mDig1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
