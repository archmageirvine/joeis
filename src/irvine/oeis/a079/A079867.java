package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079867 a(1)=1 and for n&gt;1: floor(n^(1/Omega(n)))^Omega(n), where Omega(n) is the total number of prime factors of n (A001222).
 * @author Sean A. Irvine
 */
public class A079867 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Z.valueOf(mN).root(Functions.BIG_OMEGA.i(mN)).pow(Functions.BIG_OMEGA.i(mN));
  }
}

