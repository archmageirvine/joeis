package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176771 Smallest power of 12 whose decimal expansion contains n.
 * @author Sean A. Irvine
 */
public class A176771 extends A176772 {

  @Override
  protected Z base() {
    return Z.valueOf(12);
  }
}

