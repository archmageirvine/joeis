package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029565 Quasi-Carmichael numbers to base -5: squarefree composites n such that prime p|n ==&gt; p+5|n+5.
 * @author Sean A. Irvine
 */
public class A029565 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (A029553.isQuasiCarmichael(n, -5)) {
        return n;
      }
    }
  }
}
