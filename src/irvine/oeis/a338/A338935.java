package irvine.oeis.a338;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A338935 a(n) = Sum_{d|n} (d^2 mod n).
 * @author Georg Fischer
 */
public class A338935 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf((long) d * d).mod(Z.valueOf(mN)));
  }
}
