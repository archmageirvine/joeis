package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067269 Triangular numbers which remain triangular when the most significant digit is moved to the end.
 * @author Sean A. Irvine
 */
public class A067269 extends Sequence1 {

  private long mN = 0L;

  private static Z rotate(final Z t) {
    final String s = t.toString();
    return new Z(s.substring(1) + s.charAt(0));
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++mN);
      if (Predicates.TRIANGULAR.is(rotate(t))) {
        return t;
      }
    }
  }
}

