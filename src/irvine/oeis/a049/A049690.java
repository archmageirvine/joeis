package irvine.oeis.a049;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049690 a(n) = Sum_{k=1..n} phi(2*k), where phi = Euler totient function, cf. A000010.
 * @author Sean A. Irvine
 */
public class A049690 implements Sequence {

  private Z mN = Z.valueOf(-2);
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    if (!mN.isZero()) {
      mSum = mSum.add(Euler.phi(mN));
    }
    return mSum;
  }
}
