package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176764 Smallest power of 4 whose decimal expansion contains n.
 * @author Sean A. Irvine
 */
public class A176764 extends A176772 {

  @Override
  protected Z base() {
    return Z.FOUR;
  }
}

