package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080372 a(n) is the smallest x such that the quotient d(x)/d(x+1) equals n, where d = A000005.
 * @author Sean A. Irvine
 */
public class A080372 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.SIGMA0.z(++k + 1).multiply(mN).equals(Functions.SIGMA0.z(k))) {
        return Z.valueOf(k);
      }
    }
  }
}
