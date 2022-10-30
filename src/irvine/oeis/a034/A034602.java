package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034602 Wolstenholme quotient W_p = (binomial(2p-1,p) - 1)/p^3 for prime p=A000040(n).
 * @author Sean A. Irvine
 */
public class A034602 extends A000040 {

  {
    setOffset(3);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return Binomial.binomial(p.multiply2().subtract(1), p).subtract(1).divide(p.pow(3));
  }
}
