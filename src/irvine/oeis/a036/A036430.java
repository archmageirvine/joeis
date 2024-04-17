package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036430 Number of iterations needed to reach 1 under the map n -&gt; Omega(n).
 * @author Sean A. Irvine
 */
public class A036430 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long c = 0;
    while (m != 1) {
      m = Functions.BIG_OMEGA.l(m);
      ++c;
    }
    return Z.valueOf(c);
  }
}
