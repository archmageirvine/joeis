package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066902 Integers k such that phi(prime(k)+1) = phi(prime(k)-1).
 * @author Sean A. Irvine
 */
public class A066902 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (Euler.phi(p.add(1)).equals(Euler.phi(p.subtract(1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
