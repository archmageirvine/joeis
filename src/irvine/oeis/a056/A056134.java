package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a019.A019554;

/**
 * A056134 Smallest positive integer which is the geometric mean of n and an integer other than n.
 * @author Sean A. Irvine
 */
public class A056134 extends A019554 {

  @Override
  public Z next() {
    final Z t = super.next();
    return LongUtils.isSquareFree(mN) ? Z.valueOf(2L * mN) : t;
  }
}
