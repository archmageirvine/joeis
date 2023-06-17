package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001392 a(n) = 9*binomial(2n,n-4)/(n+5).
 * @author Sean A. Irvine
 */
public class A001392 extends AbstractSequence {

  /** Construct the sequence. */
  public A001392() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 4).multiply(9).divide(mN + 5);
  }
}
