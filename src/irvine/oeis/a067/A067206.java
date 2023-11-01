package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067206 Numbers n such that the digits of n end in phi(n).
 * @author Sean A. Irvine
 */
public class A067206 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      final String p = Euler.phi(mN).toString();
      if (s.endsWith(p)) {
        return Z.valueOf(mN);
      }
    }
  }
}
