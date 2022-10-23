package irvine.oeis.a147;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A147758 Numbers whose binary representation is a palindrome formed from the reflected decimal expansion of the concatenation of 1, 0 and infinite digits 1.
 * @author Sean A. Irvine
 */
public class A147758 extends Sequence1 {

  private final StringBuilder mMiddle = new StringBuilder();
  private int mN = -1;

  @Override
  public Z next() {
    switch (++mN) {
    case 0:
      return Z.ONE;
    case 1:
      return Z.THREE;
    case 2:
      return Z.FIVE;
    case 3:
      return Z.NINE;
    default:
      mMiddle.append('1');
      return new Z("10" + mMiddle + "01", 2);
    }
  }
}

