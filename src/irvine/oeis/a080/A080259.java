package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080259 Numbers whose squarefree kernel is not a primorial number, i.e., A007947(a(n)) is not in A002110.
 * @author Sean A. Irvine
 */
public class A080259 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (!Predicates.PRIMORIAL.is(Functions.SQUARE_FREE_KERNEL.l(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

