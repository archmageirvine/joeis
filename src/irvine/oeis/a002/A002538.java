package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002538 Second-order Eulerian numbers <code>&lt;&lt;n+1,n-1&gt;&gt</code>;.
 * @author Sean A. Irvine
 */
public class A002538 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mA = mA.multiply(mN + 2).add(mF.multiply(mN));
    return mA;
  }
}
