package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a019.A019518;
import irvine.util.Permutation;

/**
 * A053160 Smallest prime associated with A053095(n), or zero if no such prime exists.
 * @author Sean A. Irvine
 */
public class A053160 extends A019518 {

  @Override
  public Z next() {
    final Z m = super.next();
    if (Functions.DIGIT_SUM.l(m) % 3 == 0) {
      return Z.ZERO;
    }
    final Permutation perm = Permutation.permuter(m);
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        final Z t = Permutation.permToZ(p);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    return Z.ZERO;
  }
}
