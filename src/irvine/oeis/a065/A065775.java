package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a049.A049604;

/**
 * A065775 Array T read by diagonals: T(i,j)=least number of knight's moves on a chessboard (infinite in all directions) needed to move from (0,0) to (i,j).
 * @author Sean A. Irvine
 */
public class A065775 extends A049604 {

  @Override
  public Z get(final Long n, final Long k) {
    return n == 2 && k == 1 ? Z.TWO : super.get(n, k);
  }
}
