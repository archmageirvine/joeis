package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066821 Numbers n such that phi(n^2-1)/(n-1) is an integer.
 * @author Sean A. Irvine
 */
public class A066821 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN * mN - 1;
      final Z phi = Functions.PHI.z(n);
      if (phi.mod(mN - 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

