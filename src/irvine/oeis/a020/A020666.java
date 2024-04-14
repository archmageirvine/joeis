package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020666 a(n)^n is the least n-th power containing every digit.
 * @author Sean A. Irvine
 */
public class A020666 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.valueOf(1023456789);
    }
    Z m = Z.TWO;
    while (Functions.SYNDROME.i(m.pow(mN)) != 0b1111111111) {
      m = m.add(1);
    }
    return m;
  }
}
