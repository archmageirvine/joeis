package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066342 Number of triangulations of the cyclic polytope C(n, n-4).
 * @author Sean A. Irvine
 */
public class A066342 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mN + 4).shiftLeft((mN - 4) / 2).subtract(mN)
      : Z.valueOf(3 * mN + 11).shiftLeft((mN - 5) / 2 - 1).subtract(mN);
  }
}
