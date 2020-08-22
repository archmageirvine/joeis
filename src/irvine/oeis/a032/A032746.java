package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032746 Super-6 Numbers (6 * n^6 contains substring '666666' in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032746 implements Sequence {

  private long mN = 27256;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(6).multiply(6).toString().contains("666666")) {
        return Z.valueOf(mN);
      }
    }
  }
}
