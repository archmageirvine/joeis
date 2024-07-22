package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032747 Super-7 Numbers (7 * n^7 contains substring '7777777' in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032747 extends Sequence0 {

  private long mN = 140996;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(7).multiply(7).toString().contains("7777777")) {
        return Z.valueOf(mN);
      }
    }
  }
}
