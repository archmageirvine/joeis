package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A007498.
 * @author Sean A. Irvine
 */
public class A007498 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final Z c = Cyclotomic.cyclotomic(mN, 10);
      final Z n = Z.valueOf(mN);
      final Z p = c.divide(n.gcd(c));
      if (p.isProbablePrime()) {
        return n;
      }
    }
  }
}

