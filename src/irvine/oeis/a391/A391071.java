package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A391071 Numbers k such that sigma(k) = psi(k) + tau(k)^4 + pi(k).
 * @author Sean A. Irvine
 */
public class A391071 extends Sequence1 {

  private final Sequence mPi = new A000720();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(mPi.next().add(Functions.DEDEKIND_PSI.z(mN)).add(Functions.SIGMA0.z(mN).pow(4)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
