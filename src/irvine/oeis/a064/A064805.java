package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064805 Numbers k such that phi(k) &gt; phi(k+2).
 * @author Sean A. Irvine
 */
public class A064805 extends Sequence1 {

  private long mN = 12;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).compareTo(Functions.PHI.z(mN + 2)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

