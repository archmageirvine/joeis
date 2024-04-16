package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005087 Number of distinct odd primes dividing n.
 * @author Sean A. Irvine
 */
public class A005087 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).makeOdd();
    return Z.ONE.equals(t) ? Z.ZERO : Z.valueOf(Functions.OMEGA.i(t));
  }
}

