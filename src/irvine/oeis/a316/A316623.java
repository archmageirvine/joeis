package irvine.oeis.a316;

import irvine.math.group.LinearGroupOrder;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A316623 Array read by antidiagonals: T(n,k) is the order of the group SL(n,Z_k).
 * @author Gregory Morse
 */
public class A316623 extends Sequence1 {

  private int mDiagonal = -1;
  private int mN = 1;

  @Override
  public Z next() {
    if (++mN > mDiagonal) {
      ++mDiagonal;
      mN = 0;
    }
    return LinearGroupOrder.residue(mN, mDiagonal + 1L - mN, true);
  }
}
