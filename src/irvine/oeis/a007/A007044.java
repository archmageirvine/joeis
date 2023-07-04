package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a047.A047812;

/**
 * A007044 Left diagonal of partition triangle A047812.
 * @author Sean A. Irvine
 */
public class A007044 extends A047812 {

  private int mN = 0;

  @Override
  public Z next() {
    final Integer key = ++mN;
    return get(key).coeff(2 * (mN + 1));
  }
}
