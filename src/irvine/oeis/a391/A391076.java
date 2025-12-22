package irvine.oeis.a391;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391076 Carmichael numbers of the form (30*k+7) * (60*k+13) * (150*k+31) * (300*k+61) * (900*k+181), k&gt;=0, where all five factors are prime.
 * @author Sean A. Irvine
 */
public class A391076 extends Sequence1 {

  private long mN = -1;

  private Z check(final long n) {
    final Z p1 = Z.valueOf(30L * n + 7);
    if (!p1.isProbablePrime()) {
      return null;
    }
    final Z p2 = Z.valueOf(60L * n + 13);
    if (!p2.isProbablePrime()) {
      return null;
    }
    final Z p3 = Z.valueOf(150L * n + 31);
    if (!p3.isProbablePrime()) {
      return null;
    }
    final Z p4 = Z.valueOf(300L * n + 61);
    if (!p4.isProbablePrime()) {
      return null;
    }
    final Z p5 = Z.valueOf(900L * n + 181);
    if (!p5.isProbablePrime()) {
      return null;
    }
    final Z prod = p1.multiply(p2).multiply(p3).multiply(p4).multiply(p5);
    return Predicates.CARMICHAEL.is(prod) ? prod : null;
  }

  @Override
  public Z next() {
    while (true) {
      final Z prod = check(++mN);
      if (prod != null) {
        return prod;
      }
    }
  }
}
