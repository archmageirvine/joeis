package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a023.A023022;

/**
 * A062950 C(H(n)), where C(n) is Chowla's function (A048050) and H(n) is the half-totient function (A023022).
 * @author Sean A. Irvine
 */
public class A062950 extends A023022 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return Jaguar.factor(n).sigma().subtract(n).subtract(1);
  }
}

