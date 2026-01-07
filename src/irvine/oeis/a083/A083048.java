package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083048 Main diagonal of table A083047.
 * @author Sean A. Irvine
 */
public class A083048 extends A083047 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}

