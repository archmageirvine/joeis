package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070816 Solutions to phi(gpf(x)) - gpf(phi(x)) = 65534 = c are special multiples of 65537, x=65537*k, where the largest prime factors of factor k were observed in {2, 3, 5, 17, 257}.
 * @author Sean A. Irvine
 */
public class A070816 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 65537;
      if (Functions.PHI.l(Functions.GPF.l(mN)) - Functions.GPF.l(Functions.PHI.l(mN)) == 65534) {
        return Z.valueOf(mN);
      }
    }
  }
}
