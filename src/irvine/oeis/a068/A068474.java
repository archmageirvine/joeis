package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068474 Numbers k such that phi((prime(k)-1)/2) = sigma(k).
 * @author Sean A. Irvine
 */
public class A068474 extends A000040 {

  private long mN = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(super.next().subtract(1).divide2()).equals(Functions.SIGMA1.z(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
