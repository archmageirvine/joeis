package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066523 Crowded numbers: for any n in the sequence, d(n)/n is larger than d(m)/m for all m &gt; n.
 * @author Sean A. Irvine
 */
public class A066523 extends Sequence1 {

  private long mN = 0;

  private boolean isCrowded(final long n) {
    final Z s0 = Functions.SIGMA0.z(n);
    for (long m = n + 2; m <= 2 * n; m += 2) {
      final Z t0 = Functions.SIGMA0.z(m);
      if (t0.multiply(n).compareTo(s0.multiply(m)) >= 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (isCrowded(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
