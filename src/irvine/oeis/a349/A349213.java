package irvine.oeis.a349;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A349213 a(n) = Sum_{d|n} n^((d+1) mod 2).
 * @author Georg Fischer
 */
public class A349213 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(mN).pow((d + 1) & 1));
  }
}
