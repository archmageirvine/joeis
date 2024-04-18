package irvine.oeis.a039;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039772 Even numbers k such that phi(k) and k-1 are distinct and have a common factor &gt; 1.
 * @author Sean A. Irvine
 */
public class A039772 extends Sequence1 {

  private long mN = 26;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long phi = Functions.PHI.l(mN);
      if (phi != mN - 1 && LongUtils.gcd(phi, mN - 1) > 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
