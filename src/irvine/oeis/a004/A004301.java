package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004301 Second-order Eulerian numbers <code>&lt;&lt;n,2&gt;&gt;</code>.
 * @author Sean A. Irvine
 */
public class A004301 implements Sequence {

  private int mN = 1;
  private Z mA = Z.valueOf(27);
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(3);
    mB = mB.multiply(2);
    return mA.subtract(mB.multiply(12 + 8L * mN)).add(3 + 6L * mN + 4L * mN * mN).divide2();
  }
}

