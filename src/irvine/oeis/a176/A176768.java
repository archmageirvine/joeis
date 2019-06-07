package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176768 Smallest power of 8 whose decimal expansion contains <code>n</code>.
 * @author Sean A. Irvine
 */
public class A176768 extends A176772 {

  @Override
  protected Z base() {
    return Z.EIGHT;
  }
}

