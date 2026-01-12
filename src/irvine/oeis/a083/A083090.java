package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083090 Main diagonal of table A083087.
 * @author Sean A. Irvine
 */
public class A083090 extends A083087 {

  private int mN = 0;

  @Override
  public Z next() {
    return matrixElement(++mN, mN);
  }
}

