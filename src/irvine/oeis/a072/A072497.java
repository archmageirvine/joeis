package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072497 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (A072498.is(++mN * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

