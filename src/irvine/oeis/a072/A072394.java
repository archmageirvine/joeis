package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072394 extends Sequence1 {

  private long mN = 1562;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.z(++mN).subtract(mN).equals(Functions.SIGMA1.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
