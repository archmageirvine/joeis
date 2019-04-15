package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001449 Binomial coefficients <code>binomial(5n,n)</code>.
 * @author Sean A. Irvine
 */
public class A001449 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(5 * mN, mN);
  }
}
