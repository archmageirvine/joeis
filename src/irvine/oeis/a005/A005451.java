package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A005451 a(n)=1 if n is a prime number, otherwise a(n)=n.
 * @author Sean A. Irvine
 */
public class A005451 extends Sequence2 {

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
