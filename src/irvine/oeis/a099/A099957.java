package irvine.oeis.a099;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A099957 a(n) = Sum_{k=0..n-1} phi(2k+1).
 * @author Sean A. Irvine
 */
public class A099957 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    mA = mA.add(Functions.PHI.l(mN));
    return mA;
  }
}
