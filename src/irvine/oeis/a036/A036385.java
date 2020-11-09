package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036385 Number of split numbers (A036382) with binary order (A029837) n, i.e., those in interval [ 2^(n-1), 2^n ].
 * @author Sean A. Irvine
 */
public class A036385 extends A036384 {

  private int mN = -2;

  @Override
  public Z next() {
    return super.next().add(++mN >= 0 ? (1L << mN) - 1 : 0);
  }
}
