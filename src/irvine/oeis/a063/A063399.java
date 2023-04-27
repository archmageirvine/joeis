package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063399 Main diagonal of arrays A063180 and A063181.
 * @author Sean A. Irvine
 */
public class A063399 extends A063179 {

  private int mN = 0;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
