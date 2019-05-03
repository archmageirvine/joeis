package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a047.A047812;

/**
 * A007044 Diagonal of partition triangle <code>A047812</code>.
 * @author Sean A. Irvine
 */
public class A007044 extends A047812 {

  private int mN = 0;

  @Override
  public Z next() {
    return getValue(++mN).coeff(2 * (mN + 1));
  }
}
