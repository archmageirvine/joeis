package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014285 Sum <code>i*prime(i), i=1..n</code>.
 * @author Sean A. Irvine
 */
public class A014285 extends A000040 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.add(super.next().multiply(++mN));
    return mA;
  }
}

