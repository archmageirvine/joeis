package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080371 a(n) is the smallest x such that the quotient d(x+1)/d(x) equals n, where d = A000005.
 * @author Sean A. Irvine
 */
public class A080371 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.SIGMA0.z(++k).multiply(mN).equals(Functions.SIGMA0.z(k + 1))) {
        return Z.valueOf(k);
      }
    }
  }
}
