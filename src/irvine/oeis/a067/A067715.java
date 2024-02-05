package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067715 Numbers k such that the sum of exponents in the prime factorization of k is &lt; log(k).
 * @author Sean A. Irvine
 */
public class A067715 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (CR.valueOf(Jaguar.factor(mN).bigOmega()).compareTo(CR.valueOf(mN).log()) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
