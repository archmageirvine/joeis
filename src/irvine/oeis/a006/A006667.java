package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006667 Number of tripling steps to reach 1 from n in '3x+1' problem, or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A006667 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN.makeOdd();
    while (!Z.ONE.equals(m)) {
      m = m.multiply(3).add(1).makeOdd();
      ++c;
    }
    return Z.valueOf(c);
  }
}
