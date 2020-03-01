package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029567 Quasi-Carmichael numbers to base <code>-7</code>: squarefree composites n such that prime <code>p|n ==&gt; p+7|n+7</code>.
 * @author Sean A. Irvine
 */
public class A029567 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (A029553.isQuasiCarmichael(n, -7)) {
        return n;
      }
    }
  }
}
