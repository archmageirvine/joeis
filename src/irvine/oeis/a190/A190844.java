package irvine.oeis.a190;
// manually intin at 2021-09-02 12:44

import irvine.math.z.Z;

/**
 * A190844 Integers in A190804/3; contains A190804 as a proper subsequence.
 * @author Georg Fischer
 */
public class A190844 extends A190804 {

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = super.next().divideAndRemainder(Z.THREE);
      if (quot[1].isZero() && !quot[0].isZero()) {
        return quot[0];
      }
    }
  }

}
