package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a328.A328785;

/**
 * A051273 Expansion of q^(-1/3) * b(q) * c(q) / a(q)^2 in powers of q where a(), b(), c() are cubic AGM theta functions.
 * @author Sean A. Irvine
 */
public class A051273 extends A328785 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
