package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082249 Reverse concatenation of 7 numbers that are multiples of 7.
 * @author Sean A. Irvine
 */
public class A082249 extends Sequence1 {

  private long mN = 16;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = new Z(new StringBuilder().append(mN - 1).append(mN - 2).append(mN - 3).append(mN - 4).append(mN - 5).append(mN - 6).append(mN - 7));
      if (t.mod(7) == 0) {
        return t;
      }
    }
  }
}
