package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389816 Numbers k such that sin(k) &gt; 1 - 1/k^2.
 * @author Sean A. Irvine
 */
public class A389816 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR z = CR.valueOf(++mN);
      if (z.sin().compareTo(CR.ONE.subtract(z.square().inverse())) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

