package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006565 Number of ways to color vertices of a hexagon using &lt;= n colors, allowing only rotations.
 * @author Sean A. Irvine
 */
public class A006565 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z s = Z.valueOf(mN).square();
    return s.subtract(2 * mN - 2).multiply(s.add(mN + 1)).multiply(mN + 1).multiply(mN).divide(6);
  }
}
