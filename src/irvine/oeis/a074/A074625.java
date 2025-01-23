package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070049.
 * @author Sean A. Irvine
 */
public class A074625 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    long k = 0;
    final long m = mM % mN;
    while (true) {
      if (Functions.SIGMA1.z(++k).mod(mN) == m) {
        return Z.valueOf(k);
      }
    }
  }
}
