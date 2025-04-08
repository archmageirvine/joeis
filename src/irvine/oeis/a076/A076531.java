package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076531 Numbers n such that sopf(phi(n)) = phi(sopf(n)), where sopf(x) = sum of the distinct prime factors of x.
 * @author Sean A. Irvine
 */
public class A076531 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.l(Functions.PHI.l(++mN)) == Functions.PHI.l(Functions.SOPF.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
