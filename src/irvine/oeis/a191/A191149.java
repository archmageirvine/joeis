package irvine.oeis.a191;
// Generated by gen_seq4.pl intin at 2021-09-02 16:28

import irvine.math.z.Z;

/**
 * A191149 Integers in (2+A191113)/4; contains A191113 as a proper subsequence.
 * @author Georg Fischer
 */
public class A191149 extends A191113 {

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = super.next().add(2).divideAndRemainder(Z.FOUR);
      if (quot[1].isZero() && !quot[0].isZero()) {
        return quot[0];
      }
    }
  }

}
