package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A029563 Quasi-Carmichael numbers to base <code>-3</code>: squarefree composites n such that for every prime p that divides n, <code>p+3</code> divides <code>n+3</code>.
 * @author Sean A. Irvine
 */
public class A029563 extends A120944 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isEven()) {
        continue;
      }
      if (A029553.isQuasiCarmichael(n, -3)) {
        return n;
      }
    }
  }
}
