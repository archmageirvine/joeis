package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A003434 Number of iterations of phi(x) at n needed to reach 1.
 * @author Sean A. Irvine
 */
public class A003434 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    while (!Z.ONE.equals(m)) {
      ++c;
      m = Euler.phi(m);
    }
    return Z.valueOf(c);
  }
}
