package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a259.A259799;

/**
 * A027601.
 * @author Sean A. Irvine
 */
public class A027601 extends A259799 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
