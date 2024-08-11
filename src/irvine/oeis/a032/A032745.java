package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032745 Super-5 Numbers (5 * n^5 contains substring '55555' in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032745 extends Sequence1 {

  private long mN = 4601;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(5).multiply(5).toString().contains("55555")) {
        return Z.valueOf(mN);
      }
    }
  }
}
