package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007306 Denominators of Farey tree fractions (i.e., the Stern-Brocot subtree in the range [0,1]).
 * @author Sean A. Irvine
 */
public class A007306 extends A007305 {

  @Override
  protected Z select(final Z num, final Z den) {
    return den;
  }
}
