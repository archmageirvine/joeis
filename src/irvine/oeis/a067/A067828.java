package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067828 Odd numbers k such that sigma(k+1) &lt; sigma(k).
 * @author Sean A. Irvine
 */
public class A067828 extends Sequence1 {

  private long mN = 43;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.SIGMA.z(mN + 1).compareTo(Functions.SIGMA.z(mN)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
