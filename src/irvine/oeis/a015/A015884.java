package irvine.oeis.a015;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015884 A modified Pierce-type expansion for Pi: <code>Pi = a(0) + Sum_{n&gt;=1} (-1)^floor(n/2)/(Product_{i=1..n} a(i))</code>.
 * @author Sean A. Irvine
 */
public class A015884 implements Sequence {

  // Modified Pierce expansion

  private CR mA = CR.PI.subtract(CR.THREE);
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.THREE;
    }
    final Z a;
    if ((mN & 1) == 0) {
      a = mA.inverse().ceil(32);
    } else {
      a = mA.inverse().floor();
    }
    mA = CR.ONE.subtract(mA.multiply(CR.valueOf(a))).abs();
    return a;
  }
}

