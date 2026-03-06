package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084033 Triangle read by rows: T(n, k) = A084029(n, k)/n.
 * @author Sean A. Irvine
 */
public class A084033 extends A084029 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

