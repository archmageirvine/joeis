package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051067 A051066 read mod 2.
 * @author Sean A. Irvine
 */
public class A051067 extends A051066 {

  @Override
  public Z next() {
    return super.next().and(Z.ONE);
  }
}
