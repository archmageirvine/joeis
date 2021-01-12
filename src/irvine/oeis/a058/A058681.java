package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A058681 Number of matroids of rank 2 on n labeled points.
 * @author Sean A. Irvine
 */
public class A058681 extends A000110 {

  {
    super.next();
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return super.next().subtract(mA);
  }
}
