package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A063449 Numbers k for which d(k+1) &gt; 2d(k), where d(j) = A000005(j).
 * @author Sean A. Irvine
 */
public class A063449 extends A000005 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z b = mA;
      mA = super.next();
      if (b.multiply2().compareTo(mA) < 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
