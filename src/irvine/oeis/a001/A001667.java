package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001667.
 * @author Sean A. Irvine
 */
public class A001667 extends A001666 {

  @Override
  protected long count(final int point) {
    final int z = z(point) - BIAS;
    final int y = y(point) - BIAS;
    final int x = x(point) - BIAS;
    return (x == -1 || x == 1) && (y == -1 || y == 1) && (z == -1 || z == 1) ? 8 : 0;
  }

  {
    mN += 2;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next();
  }
}
