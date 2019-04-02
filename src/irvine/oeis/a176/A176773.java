package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176773 Smallest power of 14 whose decimal expansion contains n.
 * @author Sean A. Irvine
 */
public class A176773 extends A176772 {

  @Override
  protected Z base() {
    return Z.valueOf(14);
  }
}

