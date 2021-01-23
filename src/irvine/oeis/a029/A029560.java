package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029560 Quasi-Carmichael numbers to base 3: squarefree composites n such that prime p|n ==&gt; p-3|n-3.
 * @author Sean A. Irvine
 */
public class A029560 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isEven() || n.mod(3) == 0) {
        continue;
      }
      if (A029553.isQuasiCarmichael(n, 3)) {
        return n;
      }
    }
  }
}
