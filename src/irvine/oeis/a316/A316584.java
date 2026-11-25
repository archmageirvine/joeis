package irvine.oeis.a316;

import irvine.math.group.Gl2ElementOrders;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A316584 Antidiagonal array of counts of solutions to x^k = I in GL(2,Z_n).
 * @author Gregory Morse
 */
public class A316584 extends Sequence1 {

  private final Gl2ElementOrders mOrders = new Gl2ElementOrders();
  private int mDiagonal = 1;
  private int mN = 1;

  @Override
  public Z next() {
    if (++mN >= mDiagonal) {
      ++mDiagonal;
      mN = 1;
    }
    return mOrders.roots(mN, Z.valueOf(mDiagonal - mN));
  }
}
