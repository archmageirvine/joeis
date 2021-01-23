package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029569 Quasi-Carmichael numbers to base -9: squarefree composites n such that prime p|n ==&gt; p+9|n+9.
 * @author Sean A. Irvine
 */
public class A029569 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (A029553.isQuasiCarmichael(n, -9)) {
        return n;
      }
    }
  }
}
