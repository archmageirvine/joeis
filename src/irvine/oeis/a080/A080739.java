package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080739 Number of elements in n-th row of A080738.
 * @author Sean A. Irvine
 */
public class A080739 extends A080738 {

  @Override
  public Z next() {
    return Z.valueOf(step());
  }
}
