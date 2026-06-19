package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A078765 Prime numbers occurring at integer Pythagorean distance (radius) from 1 in Ulam square prime-spiral. Primes on axes are excluded.
 * @author Sean A. Irvine
 */
public class A078765 extends A000040 {

  // After Max Alekseyev

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z[] t = ZUtils.ulamCoords(p);
      if (!t[0].isZero() && !t[1].isZero() && Predicates.SQUARE.is(t[0].square().add(t[1].square()))) {
        return p;
      }
    }
  }
}

