package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392120 Numbers k such that (k^3 - greatest prime &lt; k^3) &lt; (-k^3 + least prime &gt; k^3).
 * @author Sean A. Irvine
 */
public class A392120 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n3 = Z.valueOf(++mN).pow(3);
      if (n3.subtract(Functions.PREV_PRIME.z(n3)).compareTo(Functions.NEXT_PRIME.z(n3).subtract(n3)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
