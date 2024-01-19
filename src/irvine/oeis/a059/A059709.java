package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a003.A003266;

/**
 * A059709 Numbers k such that A003266(k) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A059709 extends A003266 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
