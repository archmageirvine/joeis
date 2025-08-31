package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079872 a(1)=0, a(n) = signum(round(n^(1/Omega(n)))^Omega(n) - n), where Omega(n) is the total number of prime factors of n (A001222).
 * @author Sean A. Irvine
 */
public class A079872 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(CR.valueOf(mN).pow(new Q(1, Functions.BIG_OMEGA.i(mN))).round().pow(Functions.BIG_OMEGA.i(mN)).subtract(mN).signum());
  }
}

