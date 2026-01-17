package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079832 Numbers k such that floor(reverse(k)/k) = 3.
 * @author Sean A. Irvine
 */
public class A079832 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.l(++mN) / mN == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}

