package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071287 Numerators of Peirce sequence of order 6.
 * @author Sean A. Irvine
 */
public class A071287 extends A071283 {

  {
    setOffset(0);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return select(mB.get(6, ++mN));
  }
}
