package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A393644 Squarefree numbers k with m distinct prime factors, such that gpf(k) &lt; lpf(k)^m, where gpf = A006530 and lpf = A020639.
 * @author Sean A. Irvine
 */
public class A393644 extends A005117 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final Z p = Functions.LPF.z(n);
      final Z q = Functions.GPF.z(n);
      final int omega = Functions.OMEGA.i(n);
      if (q.compareTo(p.pow(omega)) < 0) {
        return n;
      }
    }
  }
}

