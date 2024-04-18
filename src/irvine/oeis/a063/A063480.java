package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063480 C(n+3)=2*C(n), where C(n) is Cototient(n) := n - phi(n) (A051953).
 * @author Sean A. Irvine
 */
public class A063480 extends Sequence1 {

  private long mN = 38;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (Functions.PHI.l(n) * 2 - Functions.PHI.l(mN + 3) == mN - 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
