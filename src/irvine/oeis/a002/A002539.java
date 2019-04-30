package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002539 Eulerian numbers of the second kind: <code>&lt;&lt;n+3, n&gt;&gt</code>;.
 * @author Sean A. Irvine
 */
public class A002539 extends A002538 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mA = super.next().multiply(++mN).add(mA.multiply(mN + 4));
    return mA;
  }
}
