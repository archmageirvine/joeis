package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052410 Write n = m^k with m, k integers, k &gt;= 1, then a(n) is the smallest possible choice for m.
 * @author Sean A. Irvine
 */
public class A052410 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z k = mN.isPower();
    return k == null ? mN : k;
  }
}
