package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392125 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A392125 extends Sequence1 {

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
