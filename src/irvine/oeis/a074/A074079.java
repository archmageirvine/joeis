package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a073.A073346;

/**
 * A074079 Square array A(row,col) (listed in order A(0,0), A(0,1), A(1,0), A(0,2), A(1,1), A(2,0), A(0,3), etc.), giving essentially the same information as the triangle A074080 which shows only the upper triangular region.
 * @author Sean A. Irvine
 */
public class A074079 extends A073346 {

  @Override
  public Z next() {
    return super.next().divide(Z.ONE.shiftLeft(mM));
  }
}
