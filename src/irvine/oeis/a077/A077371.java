package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A077371 Fibonacci numbers whose internal digits form a Fibonacci number. Equivalently, Fibonacci numbers from which deleting the MSD and LSD leaves a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A077371 extends Sequence1 {

  private final Sequence mF = new A000045();

  @Override
  public Z next() {
    while (true) {
      final Z s = mF.next();
      final String t = s.toString();
      if (t.length() < 3 || Predicates.FIBONACCI.is(new Z(t.substring(1, t.length() - 1)))) {
        return s;
      }
    }
  }
}
