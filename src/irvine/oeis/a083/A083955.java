package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083955 Numbers n &gt; 1 such that n^5 - 2 has no prime factor &gt; n.
 * @author Sean A. Irvine
 */
public class A083955 extends Sequence1 {

  private long mN = 3556;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.z(Z.valueOf(++mN).pow(5).subtract(2)).compareTo(mN) <= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
