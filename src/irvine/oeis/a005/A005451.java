package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005451 Define b(n) <code>= (</code> (n-1)*(n^2-3*n+1)*b(n-1) - (n-2)^3*b(n-2) <code>)/(n*(n-3))</code>; b(2) = b(3) <code>= 1</code>; sequence gives denominators of b(n).
 * @author Sean A. Irvine
 */
public class A005451 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return new Q(mF.add(1), Z.valueOf(mN + 1)).den();
  }
}
