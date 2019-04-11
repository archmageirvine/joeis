package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006666 Number of halving steps to reach 1 in '3x+1' problem, or <code>-1</code> if this never happens.
 * @author Sean A. Irvine
 */
public class A006666 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    while (!Z.ONE.equals(m)) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1).divide2();
      ++c;
    }
    return Z.valueOf(c);
  }
}
