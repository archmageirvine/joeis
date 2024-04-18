package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062732 Squares arising in A039770.
 * @author Sean A. Irvine
 */
public class A062732 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      final Z phi = Functions.PHI.z(n);
      if (phi.isSquare()) {
        return phi;
      }
    }
  }
}
