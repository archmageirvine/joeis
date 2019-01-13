package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A005234.
 * @author Sean A. Irvine
 */
public class A005234 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next().add(1);
      if (pp.isProbablePrime()) {
        return Z.valueOf(mP);
      }
    }
  }
}
