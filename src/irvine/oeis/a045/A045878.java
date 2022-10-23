package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045878 Numbers k such that rotating digits of k^2 left once still yields a square.
 * @author Sean A. Irvine
 */
public class A045878 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String n2 = Z.valueOf(++mN).square().toString();
      if ((n2.length() <= 1 || n2.charAt(1) != '0') && new Z(n2.substring(1) + n2.charAt(0)).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
