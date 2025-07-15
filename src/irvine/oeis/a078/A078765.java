package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078765 Prime numbers occurring at integer Pythagorean distance (radius) from 1 in Ulam square prime-spiral. Primes on axes are excluded.
 * @author Sean A. Irvine
 */
public class A078765 extends A000040 {

  // After Max Alekseyev

  private Z[] ulamCoords(final Z n) {
    final Z k = n.multiply(4).subtract(3).sqrt().subtract(1).divide2();
    final Z k1 = k.add(1);
    final Z d = n.subtract(1).subtract(k.multiply(k1));
    if (k.isOdd()) {
      return new Z[] {k.add(1).divide2().subtract(d.min(k1)), k.add(1).divide2().subtract(d.subtract(k1).max(Z.ZERO))};
    } else {
      return new Z[] {k.negate().divide2().add(d.min(k1)), k.negate().divide2().add(d.subtract(k1).max(Z.ZERO))};
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z[] t = ulamCoords(p);
      if (!t[0].isZero() && !t[1].isZero() && Predicates.SQUARE.is(t[0].square().add(t[1].square()))) {
        return p;
      }
    }
  }
}

