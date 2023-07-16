package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064514 Write A064476(n) = 2^i(n)*3^j(n); sequence gives values of i(n).
 * @author Sean A. Irvine
 */
public class A064514 extends A064476 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}

