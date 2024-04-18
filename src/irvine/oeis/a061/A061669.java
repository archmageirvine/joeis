package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061669 a(n) = n*(mu(n) + 1), where mu(n) is the Moebius function A008683.
 * @author Sean A. Irvine
 */
public class A061669 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN * (1 + Functions.MOBIUS.i(mN)));
  }
}

