package irvine.oeis.a191;
// Generated by gen_seq4.pl intin at 2021-09-02 16:28

import irvine.math.z.Z;

/**
 * A191171 Integers in (-1+A191123)/4; contains A191123 as a proper subsequence.
 * @author Georg Fischer
 */
public class A191171 extends A191123 {

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = super.next().subtract(1).divideAndRemainder(Z.FOUR);
      if (quot[1].isZero() && !quot[0].isZero()) {
        return quot[0];
      }
    }
  }

}
