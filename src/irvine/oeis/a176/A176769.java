package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176769 Smallest power of 9 whose decimal expansion contains <code>n</code>.
 * @author Sean A. Irvine
 */
public class A176769 extends A176772 {

  @Override
  protected Z base() {
    return Z.NINE;
  }
}

