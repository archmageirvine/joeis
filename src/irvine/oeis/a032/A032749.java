package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032749 Super-9 Numbers (9*n^9 contains substring '999999999' in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032749 extends Sequence0 {

  private long mN = 17546132;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(9).multiply(9).toString().contains("999999999")) {
        return Z.valueOf(mN);
      }
    }
  }
}
