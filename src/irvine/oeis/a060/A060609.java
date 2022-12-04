package irvine.oeis.a060;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060609 Repeatedly apply Euler phi to n-th prime; a(n) = highest power of 2 that is seen.
 * @author Sean A. Irvine
 */
public class A060609 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    Z max = Z.ONE;
    while (!Z.ONE.equals(p)) {
      if (p.compareTo(max) > 0 && p.bitCount() == 1) {
        max = p;
      }
      p = Euler.phi(p);
    }
    return max;
  }
}
