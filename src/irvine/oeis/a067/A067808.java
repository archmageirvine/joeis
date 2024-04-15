package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067808 Numbers k such that sigma(k)^2 &gt; 3*sigma(k^2).
 * @author Sean A. Irvine
 */
public class A067808 extends Sequence1 {

  private long mN = 23;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Functions.SIGMA.z(n).square().compareTo(Functions.SIGMA.z(n.square()).multiply(3)) > 0) {
        return n;
      }
    }
  }
}
