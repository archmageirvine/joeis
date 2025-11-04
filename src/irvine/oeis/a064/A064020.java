package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a013.A013928;

/**
 * A064020 Numbers k such that sf(k) = phi(k), where sf(k) = A013928(k).
 * @author Sean A. Irvine
 */
public class A064020 extends A013928 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Functions.PHI.z(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
