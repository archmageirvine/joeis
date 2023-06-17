package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000590 a(n) = 13*binomial(2n,n-6)/(n+7).
 * @author Sean A. Irvine
 */
public class A000590 extends AbstractSequence {

  /** Construct the sequence. */
  public A000590() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 6).multiply(13).divide(mN + 7);
  }
}

