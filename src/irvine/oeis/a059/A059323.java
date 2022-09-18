package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a005.A005385;

/**
 * A059323 Smaller term of closest safe prime pairs.
 * @author Sean A. Irvine
 */
public class A059323 extends A005385 {

  private static final Z TWELVE = Z.valueOf(12);
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).equals(TWELVE)) {
        return t;
      }
    }
  }
}
