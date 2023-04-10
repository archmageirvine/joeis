package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A062825 Ch(n-th nonprime) where Ch(n) is Chowla's function, cf. A048050.
 * @author Sean A. Irvine
 */
public class A062825 extends A018252 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Jaguar.factor(t).sigma().subtract(t.add(1)).max(Z.ZERO);
  }
}
