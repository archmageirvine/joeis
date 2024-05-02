package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066687 Numbers n such that prime(n) == n (mod phi(n)).
 * @author Sean A. Irvine
 */
public class A066687 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long mod = Functions.PHI.l(++mN);
      if (super.next().mod(mod) == mN % mod) {
        return Z.valueOf(mN);
      }
    }
  }
}
