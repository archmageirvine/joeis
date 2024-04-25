package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067825 Even values of k such that sigma(k + 1) &gt; sigma(k).
 * @author Sean A. Irvine
 */
public class A067825 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.SIGMA.z(mN + 1).compareTo(Functions.SIGMA.z(mN)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
