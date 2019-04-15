package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007290 <code>a(n) = 2*binomial(n,3)</code>.
 * @author Sean A. Irvine
 */
public class A007290 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 3).multiply2();
  }
}
