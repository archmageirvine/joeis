package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078719 Number of odd terms among n, f(n), f(f(n)), ...., 1 for the Collatz function (that is, until reaching "1" for the first time), or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A078719 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long c = 1;
    while (!Z.ONE.equals(m)) {
      m = m.makeOdd();
      if (Z.ONE.equals(m)) {
        return Z.valueOf(c);
      }
      m = m.multiply(3).add(1);
      ++c;
    }
    return Z.valueOf(c);
  }
}
