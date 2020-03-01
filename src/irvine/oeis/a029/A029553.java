package irvine.oeis.a029;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029553 Quasi-Carmichael numbers to base <code>10</code>: squarefree composites n such that <code>(n,2*3*5*7) = 1</code> and prime <code>p|n ==&gt; p-10|n-10</code>.
 * @author Sean A. Irvine
 */
public class A029553 extends A120944 {

  static boolean isQuasiCarmichael(final Z n, final long base) {
    final Z m = n.subtract(base);
    for (final Z p : Cheetah.factor(n).toZArray()) {
      if (!Z.ZERO.equals(m.mod(p.subtract(base)))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isEven() || n.mod(3) == 0 || n.mod(5) == 0 || n.mod(7) == 0) {
        continue;
      }
      if (isQuasiCarmichael(n, 10)) {
        return n;
      }
    }
  }
}
