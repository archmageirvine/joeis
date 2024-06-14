package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070814 Solutions to phi(gpf(x)) - gpf(phi(x)) = 14 = c are special multiples of 17, x = 17k, where greatest prime factors of factor k were observed from {2, 3, 5}, i.e., it is smaller than 17. See solutions to other even cases of c (=A070813): A007283 for 0, A070004 for 2, A070815 for 254, A070816 for 65534. Gpf = greatest prime factor.
 * @author Sean A. Irvine
 */
public class A070814 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 17;
      if (Functions.PHI.l(Functions.GPF.l(mN)) - Functions.GPF.l(Functions.PHI.l(mN)) == 14) {
        return Z.valueOf(mN);
      }
    }
  }
}
