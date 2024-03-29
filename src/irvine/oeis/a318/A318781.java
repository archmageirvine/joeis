package irvine.oeis.a318;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.math.z.Z;
import irvine.oeis.a188.A188999;

/**
 * A318781 A188999(m)/m for the integers m such that A188999(m) is divisible by m, where A188999 is the bi-unitary sigma function.
 * @author Georg Fischer
 */
public class A318781 extends A188999 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z[] quot = super.next().divideAndRemainder(Z.valueOf(mN));
      if (quot[1].isZero()) {
        return quot[0];
      }
    }
  }
}
