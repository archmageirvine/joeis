package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060610 Repeatedly apply Euler phi to the n-th prime; a(n) is the number of terms in the resulting iteration chain which are not powers of 2 (number of initial iterations until reaching the first power of 2).
 * @author Sean A. Irvine
 */
public class A060610 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long cnt = 0;
    while (p.bitCount() != 1) {
      ++cnt;
      p = Functions.PHI.z(p);
    }
    return Z.valueOf(cnt);
  }
}
