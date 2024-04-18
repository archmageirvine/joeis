package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064804 Numbers 2*k such that phi(2*k + 2) &lt; phi(2*k).
 * @author Sean A. Irvine
 */
public class A064804 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.PHI.z(mN + 2).compareTo(Functions.PHI.z(mN)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

