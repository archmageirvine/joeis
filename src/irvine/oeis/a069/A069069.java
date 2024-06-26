package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069069 Numbers n such that n*phi(n-1) is a perfect square.
 * @author Sean A. Irvine
 */
public class A069069 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final long n = mN++;
      if (Functions.PHI.z(n).multiply(mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

