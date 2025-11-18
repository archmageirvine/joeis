package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A389856 Numbers k such that sigma(k) = phi(k) + tau(k) + pi(k).
 * @author Sean A. Irvine
 */
public class A389856 extends Sequence1 {

  private final Sequence mPi = new A000720();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(mPi.next().add(Functions.PHI.l(mN)).add(Functions.SIGMA0.z(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
