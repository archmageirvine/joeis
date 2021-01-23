package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176763 Smallest power of 3 whose decimal expansion contains n.
 * @author Sean A. Irvine
 */
public class A176763 extends A176772 {

  @Override
  protected Z base() {
    return Z.THREE;
  }
}

