package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069780 a(n) = gcd(d(n^3), d(n)).
 * @author Sean A. Irvine
 */
public class A069780 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA0.z(Z.valueOf(++mN).pow(3)).gcd(Functions.SIGMA0.z(mN));
  }
}

