package irvine.oeis.a283;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A283369 a(n) = Sum_{d|n} d^(4*d + 1).
 * @author Georg Fischer
 */
public class A283369 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(d).pow(4 * d + 1));
  }
}
