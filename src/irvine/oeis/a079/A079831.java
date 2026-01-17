package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079831 Numbers k such that floor(reverse(k)/k) = 2.
 * @author Sean A. Irvine
 */
public class A079831 extends Sequence1 {

  private long mN = 12;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.l(++mN) / mN == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}

