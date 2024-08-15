package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071813 Least m such that reverse(sigma(m)) = sigma(m+n).
 * @author Sean A. Irvine
 */
public class A071813 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      if (Functions.REVERSE.z(Functions.SIGMA.z(++m)).equals(Functions.SIGMA.z(mN + m))) {
        return Z.valueOf(m);
      }
    }
  }
}
