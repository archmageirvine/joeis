package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066916 a(n) = n^phi(n) - 1.
 * @author Sean A. Irvine
 */
public class A066916 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(Functions.PHI.z(mN)).subtract(1);
  }
}
