package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a259.A259976;

/**
 * A005368 Occurrences of principal character.
 * @author Sean A. Irvine
 */
public class A005368 extends A259976 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 2 * mN);
  }
}
