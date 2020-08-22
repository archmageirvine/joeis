package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029570 Quasi-Carmichael numbers to base -10: squarefree composites n such that prime p|n ==&gt; p+10|n+10.
 * @author Sean A. Irvine
 */
public class A029570 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (A029553.isQuasiCarmichael(n, -10)) {
        return n;
      }
    }
  }
}
