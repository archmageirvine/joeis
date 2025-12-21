package irvine.oeis.a387;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006881;

/**
 * A387940 a(n) is the smallest squarefree semiprime k such that n^2 + k is a perfect square.
 * @author Sean A. Irvine
 */
public class A387940 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    final Sequence s = new A006881();
    while (true) {
      final Z k = s.next();
      if (Predicates.SQUARE.is(n2.add(k))) {
        return k;
      }
    }
  }
}
