package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a056.A056152;

/**
 * A055084 Number of 6 X n binary matrices with no zero rows or columns, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A055084 extends A056152 {

  {
    setOffset(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN, 6);
  }
}
