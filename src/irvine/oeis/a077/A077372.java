package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A077372 Fibonacci numbers whose external digits form a Fibonacci number. Or Fibonacci numbers whose MSD and LSD form a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A077372 extends Sequence1 {

  private final Sequence mF = new A000045();

  @Override
  public Z next() {
    while (true) {
      final Z s = mF.next();
      final String t = s.toString();
      if (t.length() < 3 || Predicates.FIBONACCI.is((t.charAt(0) - '0') * 10 + t.charAt(t.length() - 1) - '0')) {
        return s;
      }
    }
  }
}
