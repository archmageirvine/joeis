package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067126 Numbers for which phi(n) &gt;= phi(k) for all k = 1 to n-1.
 * @author Sean A. Irvine
 */
public class A067126 extends Sequence1 {

  private Z mMax = Z.ZERO;
  private long mN = 0L;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      if (phi.compareTo(mMax) >= 0) {
        mMax = phi;
        return Z.valueOf(mN);
      }
    }
  }
}
