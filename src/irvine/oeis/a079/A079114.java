package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079114 Least squarefree number &gt; n that is coprime to n.
 * @author Sean A. Irvine
 */
public class A079114 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    while (true) {
      if (Functions.GCD.l(++k, mN) == 1 && Predicates.SQUARE_FREE.is(k)) {
        return Z.valueOf(k);
      }
    }
  }
}

