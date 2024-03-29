package irvine.oeis.a191;
// Generated by gen_seq4.pl intin at 2021-09-02 16:28

import irvine.math.z.Z;

/**
 * A191189 Integers in (3+A191132)/4; contains A191132 as a proper subsequence.
 * @author Georg Fischer
 */
public class A191189 extends A191132 {

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = super.next().add(3).divideAndRemainder(Z.FOUR);
      if (quot[1].isZero() && !quot[0].isZero()) {
        return quot[0];
      }
    }
  }

}
