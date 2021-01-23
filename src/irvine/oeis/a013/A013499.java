package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013499 a(n) = 2*n^n, n &gt;= 2, otherwise a(n) = 1.
 * @author Sean A. Irvine
 */
public class A013499 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    return Z.valueOf(mN).pow(mN).multiply2();
  }
}
