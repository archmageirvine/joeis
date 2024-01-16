package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067968.
 * @author Sean A. Irvine
 */
public class A067972 extends A067971 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
