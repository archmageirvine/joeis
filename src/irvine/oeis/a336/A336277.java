package irvine.oeis.a336;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A336277 <code>a(n) = Sum_{k=1..n} mu(k)*k^3</code>.
 * @author Sean A. Irvine
 */
public class A336277 implements Sequence {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(Z.valueOf(++mN).pow(3).multiply(Mobius.mobius(mN)));
    return mSum;
  }
}
