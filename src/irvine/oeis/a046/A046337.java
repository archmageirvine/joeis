package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046337 Odd numbers with an even number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046337 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if ((Functions.BIG_OMEGA.l(mN) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
