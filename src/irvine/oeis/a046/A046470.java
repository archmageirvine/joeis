package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046470 Even numbers with an odd number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046470 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if ((Functions.BIG_OMEGA.l(mN) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
