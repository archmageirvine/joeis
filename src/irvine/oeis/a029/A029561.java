package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029561 Quasi-Carmichael numbers to base 2: squarefree composites n such that prime p|n ==&gt; p-2|n-2.
 * @author Sean A. Irvine
 */
public class A029561 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isEven()) {
        continue;
      }
      if (A029553.isQuasiCarmichael(n, 2)) {
        return n;
      }
    }
  }
}
