package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A391395 Primes of the form (A002110(k) + A002110(k + 1)) / 2 - 1.
 * @author Sean A. Irvine
 */
public class A391395 extends Sequence1 {

  private final Sequence mS = new A002110();
  private Z mA = mS.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mS.next();
      final Z u = mA.add(t).divide2().subtract(1);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
