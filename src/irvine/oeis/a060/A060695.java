package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060695 a(n) = gcd(2n, A060766(2n)).
 * @author Sean A. Irvine
 */
public class A060695 extends Sequence1 {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    return mN.gcd(A060766.lcmDelta(Jaguar.factor(mN).divisorsSorted()));
  }
}
