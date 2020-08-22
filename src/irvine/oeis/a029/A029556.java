package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029556 Quasi-Carmichael numbers to base 7: squarefree composites n such that (n,2*3*5) = 1 and prime p|n ==&gt; p-7|n-7.
 * @author Sean A. Irvine
 */
public class A029556 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isEven() || n.mod(3) == 0 || n.mod(5) == 0 || n.mod(7) == 0) {
        continue;
      }
      if (A029553.isQuasiCarmichael(n, 7)) {
        return n;
      }
    }
  }
}
