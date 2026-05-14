package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A395740 allocated for Jose O. del Toro Barroso.
 * @author Sean A. Irvine
 */
public class A395740 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long cnt = 0;
    while (!Predicates.POWER_OF_TWO.is(p)) {
      p = Functions.LPF.z(p.multiply(3).add(1).makeOdd());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
