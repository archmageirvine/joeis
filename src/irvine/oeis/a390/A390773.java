package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A390773 Numbers k such that sigma(k) = phi(k) + tau(k)^4 + pi(k).
 * @author Sean A. Irvine
 */
public class A390773 extends Sequence1 {

  private final Sequence mPi = new A000720();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(mPi.next().add(Functions.PHI.l(mN)).add(Functions.SIGMA0.z(mN).pow(4)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
