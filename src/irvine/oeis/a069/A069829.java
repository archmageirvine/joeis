package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069829 a(n) = PS(n)(2n), where PS is described in A057032.
 * @author Sean A. Irvine
 */
public class A069829 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    for (long k = mN; k > 0; --k) {
      if (m % k == 0) {
        m += k;
      }
    }
    return Z.valueOf(m);
  }
}

