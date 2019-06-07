package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176770 Smallest power of 11 whose decimal expansion contains <code>n</code>.
 * @author Sean A. Irvine
 */
public class A176770 extends A176772 {

  @Override
  protected Z base() {
    return Z.valueOf(11);
  }
}

