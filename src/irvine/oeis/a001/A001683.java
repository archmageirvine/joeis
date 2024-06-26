package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A001683 Number of one-sided triangulations of the disk; or flexagons of order n; or unlabeled plane trivalent trees (n-2 internal vertices, all of degree 3 and hence n leaves).
 * @author Sean A. Irvine
 */
public class A001683 extends Sequence2 {

  long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z c = Functions.CATALAN.z(mN - 2).multiply(6).divide(mN);
    if ((mN & 1) == 0) {
      c = c.add(Functions.CATALAN.z(mN / 2 - 1).multiply(3));
    }
    if (mN % 3 == 0) {
      c = c.add(Functions.CATALAN.z(mN / 3 - 1).shiftLeft(2));
    }
    return c.divide(6);
  }
}
