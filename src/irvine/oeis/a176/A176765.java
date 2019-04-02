package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176765 Smallest power of 5 whose decimal expansion contains n.
 * @author Sean A. Irvine
 */
public class A176765 extends A176772 {

  @Override
  protected Z base() {
    return Z.FIVE;
  }
}

