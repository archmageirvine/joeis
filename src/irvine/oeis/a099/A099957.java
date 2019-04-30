package irvine.oeis.a099;

import irvine.math.EulerTotientSieve;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A099957 <code>a(n) = Sum_{i=0..n-1} phi(2i+1)</code>.
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
