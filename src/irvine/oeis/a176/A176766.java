package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176766 Smallest power of 6 whose decimal expansion contains n.
 * @author Sean A. Irvine
 */
public class A176766 extends A176772 {

  @Override
  protected Z base() {
    return Z.SIX;
  }
}

