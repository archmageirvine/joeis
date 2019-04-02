package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005609 Number of Boolean functions realized by cascades of n gates.
 * @author Sean A. Irvine
 */
public class A005609 extends A005608 {

  private int mN = 0;

  @Override
  public Z next() {
    return butlerN(++mN, 2, 3);
  }
}

