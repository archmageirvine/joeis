package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067082 If n = abc...def in decimal notation then the right digit sum function = abc...def + bc...def + c...def + ... + def + ef + f.
 * @author Sean A. Irvine
 */
public class A067082 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.valueOf(mN);
    long t = 10;
    while (t <= mN) {
      sum = sum.add(mN % t);
      t *= 10;
    }
    return sum;
  }
}
