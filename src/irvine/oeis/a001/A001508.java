package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a210.A210252;

/**
 * A001508 a(n) is the number of c-nets with n+1 vertices and 2n+2 edges, n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A001508 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return A210252.qStar(mN, mN + 2);
  }
}
