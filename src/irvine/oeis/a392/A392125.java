package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A392125 Numbers k such that (t(k) - greatest prime &lt; t(k)) &gt; (- t(k) + least prime &gt; t(k)), where t(k) = A000217(k).
 * @author Sean A. Irvine
 */
public class A392125 extends Sequence2 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++mN);
      final Z prev = Functions.PREV_PRIME.z(t);
      final Z next = Functions.NEXT_PRIME.z(t);
      if (t.subtract(prev).compareTo(next.subtract(t)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
