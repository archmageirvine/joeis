package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045877 Rotating digits of a(n)^2 right once still yields a square.
 * @author Sean A. Irvine
 */
public class A045877 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String n2 = Z.valueOf(++mN).square().toString();
      if (new Z(n2.charAt(n2.length() - 1) + n2.substring(0, n2.length() - 1)).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
