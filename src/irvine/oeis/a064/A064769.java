package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000142;

/**
 * A064769 Numbers n such that (n!)^2 + prime(n) is prime.
 * @author Sean A. Irvine
 */
public class A064769 extends A000142 {

  private final Sequence mPrimes = new A000040();
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().square().add(mPrimes.next()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
