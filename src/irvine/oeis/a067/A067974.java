package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067968.
 * @author Sean A. Irvine
 */
public class A067974 extends A067973 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
