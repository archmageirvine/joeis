package irvine.oeis.a038;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A038808 Palindromic numbers which are the difference of two positive cubes.
 * @author Sean A. Irvine
 */
public class A038808 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isZero()) {
        return Z.ZERO; // x == y
      }
      final Z lim = t.sqrt();
      for (Z x = Z.ONE; x.compareTo(lim) <= 0; x = x.add(1)) {
        if (Predicates.CUBE.is(t.add(x.pow(3)))) {
          return t;
        }
      }
    }
  }
}
