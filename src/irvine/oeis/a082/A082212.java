package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082212 Cube roots pertaining to A082211.
 * @author Sean A. Irvine
 */
public class A082212 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    Z lo = mA.multiply(10).add(1);
    Z hi = mA.add(1).multiply(10);
    Z mod = Z.TEN;
    while (true) {
      Z r = lo.root(3);
      while (true) {
        final Z c = r.pow(3);
        if (c.compareTo(hi) >= 0) {
          break;
        }
        if (c.compareTo(lo) >= 0) {
          mA = c.mod(mod);
          return r;
        }
        r = r.add(1);
      }
      mod = mod.multiply(10);
      lo = lo.multiply(10);
      hi = hi.multiply(10).add(9);
    }
  }
}
