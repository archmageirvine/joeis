package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037083 Numbers k such that k!!! + 1 is prime (0 is included by convention).
 * @author Sean A. Irvine
 */
public class A037083 extends Sequence1 {

  private final Z[] mA = new Z[3];
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      final int r = (int) (mN % 3);
      mA[r] = mA[r] == null ? Z.valueOf(mN) : mA[r].multiply(mN);
      final Z t = mA[r].add(1);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
