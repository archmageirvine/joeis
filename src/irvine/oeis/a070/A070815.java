package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070815 Solutions to phi(gpf(x)) - gpf(phi(x)) = 254 = c are special multiples of 257, x = 257k, where largest prime factors of factor k were observed from {2, 3, 5, 17}. See solutions to other even cases of c (=A070813): A007283 for 0, A070004 for 2, A070814 for 14, A070816 for 65534.
 * @author Sean A. Irvine
 */
public class A070815 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 257;
      if (Functions.PHI.l(Functions.GPF.l(mN)) - Functions.GPF.l(Functions.PHI.l(mN)) == 254) {
        return Z.valueOf(mN);
      }
    }
  }
}
