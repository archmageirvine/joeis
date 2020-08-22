package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029564 Quasi-Carmichael numbers to base -4: squarefree composites n such that prime p|n ==&gt; p+4|n+4.
 * @author Sean A. Irvine
 */
public class A029564 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (A029553.isQuasiCarmichael(n, -4)) {
        return n;
      }
    }
  }
}
