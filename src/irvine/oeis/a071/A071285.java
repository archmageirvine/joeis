package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071285 Numerators of Peirce sequence of order 5.
 * @author Sean A. Irvine
 */
public class A071285 extends A071283 {

  {
    setOffset(0);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return select(mB.get(5, ++mN));
  }
}
