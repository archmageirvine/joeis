package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059957 Sum of number of distinct prime factors of n and n+1, or number of distinct prime factors of n(n+1) or of lcm(n,n+1).
 * @author Sean A. Irvine
 */
public class A059957 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(++mN * (mN + 1)));
  }
}
