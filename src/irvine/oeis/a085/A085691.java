package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085691 Triangle read by rows: T(n,k) is the number of triangles of side k in triangular matchstick arrangement of side n; n&gt;=1 and k&gt;=1.
 * @author Sean A. Irvine
 */
public class A085691 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return 2 * mM > mN
      ? Functions.TRIANGULAR.z(mN - mM + 1)
      : Z.valueOf(mN).square().subtract(Z.valueOf(3 * mN).multiply(mM - 1)).add(Z.valueOf(5 * mM - 4).multiply(mM - 1).divide2());
  }
}

