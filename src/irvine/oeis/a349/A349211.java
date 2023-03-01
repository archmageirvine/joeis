package irvine.oeis.a349;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A349211 a(n) = Sum_{d|n} d^((d+1) mod 2).
 * @author Georg Fischer
 */
public class A349211 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.valueOf(d).pow((d + 1) & 1));
  }
}
