package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000589 a(n) = 11*binomial(2n,n-5)/(n+6).
 * @author Sean A. Irvine
 */
public class A000589 extends AbstractSequence {

  /** Construct the sequence. */
  public A000589() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 5).multiply(11).divide(mN + 6);
  }
}

