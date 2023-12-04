package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067102.
 * @author Sean A. Irvine
 */
public class A067118 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mX.insert(0, 2 * ++mN);
    mY.append(2 * mN - 1);
    return new Z(mX).divide(new Z(mY));
  }
}
