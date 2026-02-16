package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393287 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A393287 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final Z m = Z.valueOf(++k).square().add(mN);
      if (m.mod(10) != 0 && Predicates.SQUARE.is(Functions.REVERSE.l(m))) {
        return Z.valueOf(k);
      }
    }
  }
}
