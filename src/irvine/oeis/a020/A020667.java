package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020667.
 * @author Sean A. Irvine
 */
public class A020667 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.valueOf(1023456789);
    }
    Z m = Z.TWO;
    Z power;
    while (A020666.syndrome((power = m.pow(mN))) != 0b1111111111) {
      m = m.add(1);
    }
    return power;
  }
}
