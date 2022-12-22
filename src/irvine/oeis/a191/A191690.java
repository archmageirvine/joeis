package irvine.oeis.a191;
// manually A083064/arronk

import irvine.math.z.Z;
import irvine.oeis.a083.A083064;

/**
 * A191690 a(n) = n^n-n^(n-1)-n^(n-2)-...-n^2-n-1.
 * @author Georg Fischer
 */
public class A191690 extends A083064 {

  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : super.matrixElement(mN + 1, mN - 1);
  }
}

