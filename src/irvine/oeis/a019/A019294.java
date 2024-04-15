package irvine.oeis.a019;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019294 Number (&gt; 0) of iterations of sigma (A000203) required to reach a multiple of n when starting with n.
 * @author Sean A. Irvine
 */
public class A019294 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    do {
      ++c;
      m = Functions.SIGMA.z(m);
    } while (!m.mod(mN).isZero());
    return Z.valueOf(c);
  }
}

