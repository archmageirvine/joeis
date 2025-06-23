package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078204.
 * @author Sean A. Irvine
 */
public class A078209 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z n = Z.valueOf(++mN);
    Z tens = Z.ONE;
    while (true) {
      tens = tens.multiply(10);
      final Z w = n.multiply(tens);
      if (w.mod(p).isZero()) {
        return w;
      }
      final Z v = p.subtract(tens.modMultiply(n, p));
      if (v.compareTo(tens) < 0) {
        return w.add(v);
      }
    }
  }
}

