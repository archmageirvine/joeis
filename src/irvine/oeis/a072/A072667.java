package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072656.
 * @author Sean A. Irvine
 */
public class A072667 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = super.next();
      if (mP.add(q).subtract(1).isProbablePrime()) {
        return q;
      }
    }
  }
}
