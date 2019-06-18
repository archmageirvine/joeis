package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023993.
 * @author Sean A. Irvine
 */
public class A023993 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(3 * mN, mN + 2, mN - 1, mN - 1));
  }
}

