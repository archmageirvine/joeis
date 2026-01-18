package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083253 Smallest number k for which abs(A045763(k) - A073757(k)) = n, i.e., signed difference of size of related and unrelated sets to k equals either n or -n.
 * @author Sean A. Irvine
 */
public class A083253 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Math.abs(++k - 2 * (Functions.SIGMA0.l(k) + Functions.PHI.l(k) - 1)) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

