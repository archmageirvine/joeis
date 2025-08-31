package irvine.oeis.a387;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387123 Numbers k such that Sum_{i=1..r} (k-i) and Sum_{i=1..r} (k+i) are both triangular for some r with 1 &lt;= r &lt; k.
 * @author Sean A. Irvine
 */
public class A387123 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    long s = 0;
    long t = 0;
    for (int k = 1; k < n; ++k) {
      s += n - k;
      t += n + k;
      if (Predicates.TRIANGULAR.is(s) && Predicates.TRIANGULAR.is(t)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
