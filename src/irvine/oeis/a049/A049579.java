package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049579 Numbers k such that prime(k)+2 divides (prime(k)-1)!.
 * @author Sean A. Irvine
 */
public class A049579 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      final Z mod = p.add(2);
      Z f = Z.ONE;
      for (Z k = Z.TWO; k.compareTo(p) < 0; k = k.add(1)) {
        f = f.modMultiply(k, mod);
        if (f.isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

