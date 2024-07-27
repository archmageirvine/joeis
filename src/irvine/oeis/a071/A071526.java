package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071526 Numbers k such that j mod phi(j) &lt; k mod phi(k) for any j &lt; k.
 * @author Sean A. Irvine
 */
public class A071526 extends Sequence1 {

  private long mN = 0;
  private long mMax = -1;

  @Override
  public Z next() {
    while (true) {
      final long r = ++mN % Functions.PHI.l(mN);
      if (r > mMax) {
        mMax = r;
        return Z.valueOf(mN);
      }
    }
  }
}
