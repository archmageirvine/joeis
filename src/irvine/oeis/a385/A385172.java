package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A385172 allocated for Claude H. R. Dequatre.
 * @author Sean A. Irvine
 */
public class A385172 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.ONE;
    }
    final Z concat = new Z(p.subtract(1).toString() + p);
    long k = 0;
    while (true) {
      k += 2;
      if (concat.mod(p.add(k)).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
