package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a034.A034699;

/**
 * A057111 Numbers n which are a factor of (LPP(n)-1)!, where LPP(n) is the largest prime power factor of n.
 * @author Sean A. Irvine
 */
public class A057111 extends A034699 {

  @Override
  public Z next() {
    while (true) {
      final long lpp = super.next().longValueExact();
      long f = 1;
      for (long k = 2; k < lpp; ++k) {
        f *= k;
        f %= mN;
        if (f == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
