package irvine.oeis.a159;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A159034 Inverse Euler transform of A155200.
 * @author Georg Fischer
 */
public class A159034 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(n) = (1/n)*Sum_{d|n} 2^(d^2)*moebius(n/d).
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.ONE.shiftLeft((long) d * d).multiply(Functions.MOBIUS.i((long) (mN / d)))).divide(mN);
  }
}
