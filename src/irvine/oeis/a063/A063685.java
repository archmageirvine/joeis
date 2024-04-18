package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A063685 Numbers k such that !k + phi(k) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A063685 extends A003422 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().add(Functions.PHI.z(mN + 1).subtract(1)).isProbablePrime()) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
