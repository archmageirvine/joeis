package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069282 Numbers n such that phi(reversal(n)) = reversal(phi(n)). Ignore leading 0's.
 * @author Sean A. Irvine
 */
public class A069282 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long n = Functions.REVERSE.l(++mN);
      if (Functions.PHI.z(n).equals(Functions.REVERSE.z(Functions.PHI.z(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
