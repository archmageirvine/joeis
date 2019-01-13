package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005447.
 * @author Sean A. Irvine
 */
public class A005447 extends A005446 {

  @Override
  public Z next() {
    return get(++mN).num();
  }
}
