package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029555 Quasi-Carmichael numbers to base <code>8</code>: squarefree composites n such that <code>(n,2*3*5*7) = 1</code> and prime <code>p|n ==&gt; p-8|n-8</code>.
 * @author Sean A. Irvine
 */
public class A029555 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isEven() || n.mod(3) == 0 || n.mod(5) == 0 || n.mod(7) == 0) {
        continue;
      }
      if (A029553.isQuasiCarmichael(n, 8)) {
        return n;
      }
    }
  }
}
