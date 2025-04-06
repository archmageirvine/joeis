package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;

/**
 * A076444 Smallest powerful number (definition 1) such that a(n)+n is also powerful.
 * @author Sean A. Irvine
 */
public class A076444 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence powerful = new A001694();
    while (true) {
      final Z a = powerful.next();
      if (Predicates.POWERFUL.is(a.add(mN))) {
        return a;
      }
    }
  }
}
