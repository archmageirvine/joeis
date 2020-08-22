package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029568 Quasi-Carmichael numbers to base -8: squarefree composites n such that prime p|n ==&gt; p+8|n+8.
 * @author Sean A. Irvine
 */
public class A029568 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (A029553.isQuasiCarmichael(n, -8)) {
        return n;
      }
    }
  }
}
