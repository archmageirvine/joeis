package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a241.A241171;

/**
 * A002456.
 * @author Sean A. Irvine
 */
public class A002456 extends A241171 {

  private int mN = 0;

  @Override
  public Z next() {
    return joffeDifference(++mN, mN - 1);
  }
}
