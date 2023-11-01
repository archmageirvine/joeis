package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066663 Numbers n such that phi(n) is a proper substring of n.
 * @author Sean A. Irvine
 */
public class A066663 extends Sequence1 {

  private long mN = 1319;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      final String p = Euler.phi(mN).toString();
      if (p.length() < s.length() && s.contains(p)) {
        return Z.valueOf(mN);
      }
    }
  }
}
