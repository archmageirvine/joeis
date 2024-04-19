package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000090 Expansion of e.g.f. exp((-x^3)/3)/(1-x).
 * @author Sean A. Irvine
 */
public class A000090 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    Z u = Z.ONE;
    for (int k = 0; k <= mN / 3; ++k) {
      final Z t = Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k)).divide(u);
      r = r.signedAdd((k & 1) == 0, t);
      u = u.multiply(3);
    }
    return r;
  }

}

