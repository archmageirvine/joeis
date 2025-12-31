package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082897 Perfect totient numbers.
 * @author Sean A. Irvine
 */
public class A082897 extends Sequence1 {

  // After Peter Luschny

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      long k = 0;
      long p = Functions.PHI.l(mN);
      while (1 < p) {
        k += p;
        p = Functions.PHI.l(p);
      }
      if (k + 1 == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
