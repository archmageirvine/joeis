package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002942 a(n) = n^2 written backwards.
 * @author Sean A. Irvine
 */
public class A002942 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.REVERSE.z(mN.square());
  }
}
