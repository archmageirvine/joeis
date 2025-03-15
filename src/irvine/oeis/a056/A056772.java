package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056772 Numbers k such that phi(k+4) = phi(k) + 4, where phi(k) = A000010(k) is Euler's totient function.
 * @author Sean A. Irvine
 */
public class A056772 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN + 4;
      if (Functions.PHI.l(n) == Functions.PHI.l(mN) + 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
