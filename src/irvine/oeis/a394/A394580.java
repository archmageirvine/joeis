package irvine.oeis.a394;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002110;

/**
 * A333024.
 * @author Sean A. Irvine
 */
public class A394580 extends A000040 {

  private final Sequence mPrimorial = new A002110().skip(2);

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    Z t = mPrimorial.next();
    while (true) {
      t = t.subtract(1);
      if (Predicates.SMOOTH.is(p, t)) {
        return t;
      }
    }
  }
}
