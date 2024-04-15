package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068403 Numbers k such that sigma(k) &gt; 3*k.
 * @author Sean A. Irvine
 */
public class A068403 extends Sequence1 {

  private long mN = 179;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).compareTo(Z.valueOf(3 * mN)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
