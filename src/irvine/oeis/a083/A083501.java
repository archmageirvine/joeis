package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083501 Cube roots arising in A083500.
 * @author Sean A. Irvine
 */
public class A083501 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      final Z t = n.multiply(mN + ++k).add(1);
      if (Predicates.CUBE.is(t)) {
        return t.root(3);
      }
    }
  }
}
