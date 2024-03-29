package irvine.oeis.a190;
// Generated by gen_seq4.pl intin at 2021-09-02 16:28

import irvine.math.z.Z;

/**
 * A190852 Integers in (-1+A190808)/3; contains A190808 as a proper subsequence.
 * @author Georg Fischer
 */
public class A190852 extends A190808 {

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = super.next().subtract(1).divideAndRemainder(Z.THREE);
      if (quot[1].isZero() && !quot[0].isZero()) {
        return quot[0];
      }
    }
  }

}
