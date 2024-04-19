package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002005 Number of rooted planar cubic maps with 2n vertices.
 * @author Sean A. Irvine
 */
public class A002005 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.MULTIFACTORIAL.z(3 * mN).shiftLeft(2L * mN + 1).divide(Functions.FACTORIAL.z(mN + 2)).divide(Functions.MULTIFACTORIAL.z(mN));
  }
}
