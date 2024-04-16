package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024628 Odd numbers k such that neither k nor k + 2 is a power of a prime.
 * @author Sean A. Irvine
 */
public class A024628 extends Sequence1 {

  private long mN = 31;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.OMEGA.i(mN) != 1 && Functions.OMEGA.i(mN + 2) != 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
