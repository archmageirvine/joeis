package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a014.A014197;

/**
 * A385974 allocated for Hal M. Switkay.
 * @author Sean A. Irvine
 */
public class A385974 extends A014197 {

  private Z mSum = Z.NEG_ONE;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().multiply(mN));
    return mSum;
  }
}

