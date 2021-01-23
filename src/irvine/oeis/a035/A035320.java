package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035320 Right-hand diagonal of A035309.
 * @author Sean A. Irvine
 */
public class A035320 extends A035309 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return t(mN, mN / 2);
  }
}

