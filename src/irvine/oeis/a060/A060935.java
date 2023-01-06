package irvine.oeis.a060;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A060935 Sum of entries in n-th antidiagonal in A060854.
 * @author Sean A. Irvine
 */
public class A060935 extends A060854 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> t(k, mN + 1 - k));
  }
}
