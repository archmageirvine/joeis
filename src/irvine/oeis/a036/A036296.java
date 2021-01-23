package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036296 Denominator of Sum i/2^i, i=1..n.
 * @author Sean A. Irvine
 */
public class A036296 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Q.TWO.subtract(new Q(Z.valueOf(++mN + 2), Z.ONE.shiftLeft(mN))).den();
  }
}

