package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071720 Number of spanning trees in K_{n}-e, the complete graph on n nodes minus an edge (n &gt; 1).
 * @author Sean A. Irvine
 */
public class A071720 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 3).multiply(mN - 2);
  }
}
