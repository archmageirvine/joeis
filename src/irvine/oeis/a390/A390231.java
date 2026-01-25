package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390231 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A390231 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.FIBONACCI.is(Functions.SIGMA1.z(++mN)) && Predicates.FIBONACCI.is(Functions.SIGMA0.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
