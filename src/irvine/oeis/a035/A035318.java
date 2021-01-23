package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035318 Right-hand diagonal of A035309.
 * @author Sean A. Irvine
 */
public class A035318 extends A035309 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN / 2);
  }
}

