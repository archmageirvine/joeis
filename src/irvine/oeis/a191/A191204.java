package irvine.oeis.a191;
// Generated by gen_seq4.pl intin at 2021-09-02 16:28

import irvine.math.z.Z;

/**
 * A191204 Integers in (-2+A191140)/3; contains A191140 as a proper subsequence.
 * @author Georg Fischer
 */
public class A191204 extends A191140 {

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = super.next().subtract(2).divideAndRemainder(Z.THREE);
      if (quot[1].isZero() && !quot[0].isZero()) {
        return quot[0];
      }
    }
  }

}
