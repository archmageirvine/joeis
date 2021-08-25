package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051069 A051068 read mod 2.
 * @author Sean A. Irvine
 */
public class A051069 extends A051068 {

  @Override
  public Z next() {
    return super.next().and(Z.ONE);
  }
}
