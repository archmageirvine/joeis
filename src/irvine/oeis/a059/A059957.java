package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059957 Sum of distinct prime factors of n and n+1, or number of prime factors of n(n+1) or of lcm(n,n+1).
 * @author Sean A. Irvine
 */
public class A059957 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(++mN * (mN + 1)).omega());
  }
}
