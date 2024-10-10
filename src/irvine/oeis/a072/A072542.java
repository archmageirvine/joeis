package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072542 a(n) = the least positive integer k such that sigma(k) &gt; sigma(1) + ... + sigma(n).
 * @author Sean A. Irvine
 */
public class A072542 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(Functions.SIGMA1.z(++mN));
    long k = mN;
    while (true) {
      if (Functions.SIGMA1.z(++k).compareTo(mSum) > 0) {
        return Z.valueOf(k);
      }
    }
  }
}
