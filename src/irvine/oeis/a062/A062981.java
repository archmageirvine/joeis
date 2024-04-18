package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062981 a(n) = n^phi(n).
 * @author Sean A. Irvine
 */
public class A062981 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(Functions.PHI.z(mN));
  }
}

