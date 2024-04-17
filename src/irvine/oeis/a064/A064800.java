package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064800 n plus the number of its prime factors: a(n) = n + A001222(n).
 * @author Sean A. Irvine
 */
public class A064800 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Functions.BIG_OMEGA.l(++mN) + mN);
  }
}

