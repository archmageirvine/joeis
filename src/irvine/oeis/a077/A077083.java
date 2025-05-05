package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077046.
 * @author Sean A. Irvine
 */
public class A077083 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    while (true) {
      ++cnt;
      final Z s = Functions.PHI.z(Functions.SIGMA1.z(t).add(Functions.PHI.z(t)));
      if (s.equals(t)) {
        return Z.valueOf(cnt);
      }
      t = s;
    }
  }
}

