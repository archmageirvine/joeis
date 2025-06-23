package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078204.
 * @author Sean A. Irvine
 */
public class A078208 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z n = Z.valueOf(++mN);
    if (Z.TWO.equals(p)) {
      return Z.TWO;
    }
    Z tens = Z.ONE;
    while (true) {
      tens = tens.multiply(10);
      final Z w = p.multiply(tens);
      if (w.mod(mN) == 0) {
        return w;
      }
      final Z v = n.subtract(tens.modMultiply(p, n));
      if (v.compareTo(tens) < 0) {
        return w.add(v);
      }
    }
  }
}

