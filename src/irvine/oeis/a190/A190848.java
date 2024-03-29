package irvine.oeis.a190;
// Generated by gen_seq4.pl intin at 2021-09-02 16:28

import irvine.math.z.Z;

/**
 * A190848 Integers in (-2+A190806)/3; contains A190806 as a proper subsequence.
 * @author Georg Fischer
 */
public class A190848 extends A190806 {

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
