package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060866 Sum of (d+d') over all unordered pairs (d,d') with d*d' = n.
 * @author Sean A. Irvine
 */
public class A060866 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z sigma = Functions.SIGMA1.z(mN);
    return mN.isSquare() ? sigma.add(mN.sqrt()) : sigma;
  }
}
