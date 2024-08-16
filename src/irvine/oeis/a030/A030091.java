package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A030091 Primes such that p and p^2 have same set of digit
 * @author Sean A. Irvine
 */
public class A030091 extends Sequence1 {

  private static final Sequence A000040 = new A000040();

  static boolean isOk(final Z a, final Z b) {
    final int[] synA = ZUtils.digitCounts(a);
    final int[] synB = ZUtils.digitCounts(b);
    for (int k = 0; k < synA.length; ++k) {
      if (synA[k] > 0 ^ synB[k] > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = A000040.next();
      if (isOk(p, p.square())) {
        return p;
      }
    }
  }
}

