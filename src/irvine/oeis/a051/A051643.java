package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a047.A047812;

/**
 * A051643 Central elements in Parker's partition triangle.
 * @author Sean A. Irvine
 */
public class A051643 extends A047812 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return getValue(mN).coeff(mN * mN / 2);
  }
}
