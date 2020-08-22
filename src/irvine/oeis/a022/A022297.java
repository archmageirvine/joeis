package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a013.A013947;

/**
 * A022297 Index of n-th 1 in A006928.
 * @author Sean A. Irvine
 */
public class A022297 extends A013947 {

  @Override
  public Z next() {
    return Z.ONE.max(super.next().subtract(1));
  }
}
