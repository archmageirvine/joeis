package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a048.A048601;

/**
 * A051106 Second diagonal of triangle A048601.
 * @author Sean A. Irvine
 */
public class A051106 extends A048601 {

  private int mN = 1;

  @Override
  public Z next() {
    return t(++mN, 2);
  }
}
