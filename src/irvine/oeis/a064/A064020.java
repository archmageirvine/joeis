package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a013.A013928;

/**
 * A064020 Numbers n such that sf(n) = phi(n), where sf(n) = A013928(n).
 * @author Sean A. Irvine
 */
public class A064020 extends A013928 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (super.next().equals(Functions.PHI.z(n))) {
        return Z.valueOf(mN);
      }
    }
  }
}
