package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032743 Super-2 Numbers (2 * n^2 contains substring '22' in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032743 implements Sequence {

  private long mN = 18;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).square().multiply2().toString().contains("22")) {
        return Z.valueOf(mN);
      }
    }
  }
}
