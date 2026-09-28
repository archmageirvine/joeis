package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a056.A056830;

/**
 * A086696 Least k such that A056830(n) + k is semiprime, where A056830 = alternate digits 1 and 0.
 * @author Sean A. Irvine
 */
public class A086696 extends Sequence1 {

  private final Sequence mS = new A056830().skip();

  @Override
  public Z next() {
    final Z t = mS.next();
    long k = -1;
    while (!Predicates.SEMIPRIME.is(t.add(++k))) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
