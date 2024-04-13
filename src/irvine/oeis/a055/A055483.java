package irvine.oeis.a055;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055483 a(n) is the GCD of n and the reverse of n.
 * @author Sean A. Irvine
 */
public class A055483 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.gcd(++mN, Functions.REVERSE.l(mN)));
  }
}
