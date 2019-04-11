package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005618 <code>a(n) = 6*a(n-1) - 8</code>.
 * @author Sean A. Irvine
 */
public class A005618 extends A005608 {

  private int mN = -1;

  @Override
  public Z next() {
    return butlerN(++mN, 2, 2);
  }
}

