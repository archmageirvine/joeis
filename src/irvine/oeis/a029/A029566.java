package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029566 Quasi-Carmichael numbers to base -6: squarefree composites n such that prime p|n ==&gt; p+6|n+6.
 * @author Sean A. Irvine
 */
public class A029566 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (A029553.isQuasiCarmichael(n, -6)) {
        return n;
      }
    }
  }
}
