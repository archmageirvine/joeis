package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078752 Least m&gt;n such that phi(m) &gt;= 2*phi(n), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A078752 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long phi2 = Functions.PHI.l(++mN) * 2;
    long m = mN;
    while (true) {
      if (Functions.PHI.l(++m) >= phi2) {
        return Z.valueOf(m);
      }
    }
  }
}
