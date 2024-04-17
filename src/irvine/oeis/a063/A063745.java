package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063745 Even numbers with an even number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A063745 extends Sequence1 {

  private long mN = 2;

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
