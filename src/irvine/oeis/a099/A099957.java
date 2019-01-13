package irvine.oeis.a099;

import irvine.math.EulerTotientSieve;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A099957.
 * @author Sean A. Irvine
 */
public class A099957 implements Sequence {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    mA = mA.add(EulerTotientSieve.phi(mN));
    return mA;
  }
}
