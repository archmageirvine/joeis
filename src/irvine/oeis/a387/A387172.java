package irvine.oeis.a387;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a007.A007774;

/**
 * A387172 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A387172 extends A007774 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      final Z[] p = fs.toZArray();
      final long e0 = fs.getExponent(p[0]);
      final long e1 = fs.getExponent(p[1]);
      if (e0 != e1) {
        if (Predicates.SQUARE.is(p[1].subtract(p[0]).square().add((e1 - e0) * (e1 - e0)))) {
          return n;
        }
      }
    }
  }
}

