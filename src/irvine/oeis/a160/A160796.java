package irvine.oeis.a160;

import irvine.math.z.Z;

/**
 * A160796.
 * @author Sean A. Irvine
 */
public class A160796 extends A160118 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z r = super.next().subtract(1).divide(4).multiply(3).add(2);
    return ++mN < 2 ? Z.valueOf(mN) : r;
  }
}

