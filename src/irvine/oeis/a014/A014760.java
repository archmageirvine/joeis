package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014760.
 * @author Sean A. Irvine
 */
public class A014760 extends A014475 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isEven() && !Z.ONE.equals(t)) {
        return t.square();
      }
    }
  }
}
