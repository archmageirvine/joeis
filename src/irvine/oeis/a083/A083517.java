package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a334.A334130;

/**
 * A083517 Triangular numbers which are one more than a product of distinct triangular numbers.
 * @author Sean A. Irvine
 */
public class A083517 extends Sequence1 {

  private final Sequence mProds = new A334130().skip();

  @Override
  public Z next() {
    while (true) {
      final Z p = mProds.next().add(1);
      if (Predicates.TRIANGULAR.is(p)) {
        return p;
      }
    }
  }
}

