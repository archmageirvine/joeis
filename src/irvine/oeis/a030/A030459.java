package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030459 Prime p concatenated with next prime is also prime.
 * @author Sean A. Irvine
 */
public class A030459 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP;
      mP = super.next();
      if (new Z(t.toString() + mP).isProbablePrime()) {
        return t;
      }
    }
  }
}
