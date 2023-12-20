package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067541 phi(n*(n+1)/2)/phi(n) where phi is the Euler totient function A000010(n).
 * @author Sean A. Irvine
 */
public class A067541 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Euler.phi(++mN * (mN + 1) / 2).divide(Euler.phi(mN));
  }
}
