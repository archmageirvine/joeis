package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082247 Multiples of 7 that are concatenation of 7 consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A082247 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = new Z(new StringBuilder().append(mN + 1).append(mN + 2).append(mN + 3).append(mN + 4).append(mN + 5).append(mN + 6).append(mN + 7));
      if (t.mod(7) == 0) {
        return t;
      }
    }
  }
}
