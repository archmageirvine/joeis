package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049563 a(n) = ((prime(n)-1)! + 1) mod (prime(n) + 2).
 * @author Sean A. Irvine
 */
public class A049563 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z mod = p.add(2);
    Z f = Z.ONE;
    for (Z k = Z.TWO; k.compareTo(p) < 0; k = k.add(1)) {
      f = f.modMultiply(k, mod);
    }
    return f.add(1).mod(mod);
  }
}

