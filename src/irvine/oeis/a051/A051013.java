package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a018.A018788;

/**
 * A051013 Number of nonaveraging subsets on {1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A051013 extends A018788 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(super.next());
  }
}
