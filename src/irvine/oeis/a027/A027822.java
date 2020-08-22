package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027822 42*(n+1)*C(n+6,10).
 * @author Sean A. Irvine
 */
public class A027822 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 5, 10).multiply(42 * mN);
  }
}
