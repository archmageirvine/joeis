package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065749 Numbers k such that the pair (prime(k) - k)*(prime(k) + k) +- 1 is a twin prime.
 * @author Sean A. Irvine
 */
public class A065749 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      final Z t = p.subtract(mN).multiply(p.add(mN));
      if (t.add(1).isProbablePrime() && t.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
