package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076374 Smallest solution to x+n*phi(x) = sigma(x) = x+n*A000010(x) = A000203(x).
 * @author Sean A. Irvine
 */
public class A076374 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      if (Functions.SIGMA1.z(++m).equals(Functions.PHI.z(m).multiply(mN).add(m))) {
        return Z.valueOf(m);
      }
    }
  }
}
