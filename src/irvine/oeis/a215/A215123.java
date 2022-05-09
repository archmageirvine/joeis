package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.a176.A176129;

/**
 * A215123 Number of solid standard Young tableaux of shape [[n^2,n],[n]].
 * @author Georg Fischer
 */
public class A215123 extends A176129 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, mN);
  }
}
