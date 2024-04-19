package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A046649 a(n) is the number of nonseparable planar maps with 2*n+1 edges and a fixed outer face of 4 edges which are invariant under a rotation of a 1/2 turn. (Column 2 of A091665.).
 * @author Sean A. Irvine
 */
public class A046649 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(3 * mN - 5).multiply(7L * mN - 11).multiply(4)
      .divide(Functions.FACTORIAL.z(2 * mN - 1)).divide(Functions.FACTORIAL.z(mN - 2));
  }
}
