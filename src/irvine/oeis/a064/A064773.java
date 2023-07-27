package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064773 Numbers n such that n^n + p(n) is prime.
 * @author Sean A. Irvine
 */
public class A064773 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (super.next().add(n.pow(mN)).isProbablePrime()) {
        return n;
      }
    }
  }
}
