package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079871 a(1)=1 and for n&gt;1: ceiling(n^(1/Omega(n)))^Omega(n), where Omega(n) is the total number of prime factors of n (A001222).
 * @author Sean A. Irvine
 */
public class A079871 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : CR.valueOf(mN).pow(new Q(1, Functions.BIG_OMEGA.i(mN))).ceil().pow(Functions.BIG_OMEGA.i(mN));
  }
}

