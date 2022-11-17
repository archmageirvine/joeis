package irvine.oeis.a216;

import irvine.math.z.Z;
import irvine.oeis.a004.A004003;

/**
 * A216675 Number of ways one can draw arrows between adjacent nodes of an n X n grid such that each node has one outgoing and one incoming arrow.
 * @author Georg Fischer
 */
public class A216675 extends A004003 {

  private int mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? Z.ZERO : super.next().square();
  }
}
