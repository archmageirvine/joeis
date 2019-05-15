package irvine.oeis.a302;

import irvine.math.z.Z;
import irvine.oeis.a007.A007825;

/**
 * A302408 Number of n step self-avoiding walks on 3 X infinity grid starting from <code>(0,0)</code>.
 * @author Sean A. Irvine
 */
public class A302408 extends A007825 {

  @Override
  protected long count(final int point) {
    return 1;
  }

  @Override
  public Z next() {
    mN += step();
    if (mN == 0) {
      return Z.ONE;
    }
    setPathLength(mN);
    setPathElement(0, c(0, 0));
    final long leftRight = count(c(1, 0), 1);
    final long up = count(c(0, 1), 1);
    return Z.valueOf(leftRight).multiply2().add(up);
  }
}
