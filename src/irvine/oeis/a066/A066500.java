package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066500 Numbers k such that 5 divides phi(k).
 * @author Sean A. Irvine
 */
public class A066500 extends Sequence1 {

  private long mN = 10;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (Functions.PHI.z(n).mod(5) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
