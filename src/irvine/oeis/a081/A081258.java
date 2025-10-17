package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081258 Numbers k &gt; 1 such that k^3 - 1 (or equivalently k^2 + k + 1) has no prime factor greater than k.
 * @author Sean A. Irvine
 */
public class A081258 extends Sequence1 {

  private long mN = 15;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.z(Z.valueOf(++mN).square().add(mN + 1)).compareTo(mN) <= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
