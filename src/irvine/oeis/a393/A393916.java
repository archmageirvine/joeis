package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393916 allocated for Duc Ngo.
 * @author Sean A. Irvine
 */
public class A393916 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Functions.TRIANGULAR.z(++mN);
    long k = 1;
    Z u = t;
    while (!Predicates.POLYGONAL.is(5, u)) {
      u = u.add(t);
      ++k;
    }
    return Z.valueOf(k);
  }
}
