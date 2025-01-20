package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074271 Previous term + prime(previous term).
 * @author Sean A. Irvine
 */
public class A074271 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Functions.PRIME.z(mA));
    return mA;
  }
}
