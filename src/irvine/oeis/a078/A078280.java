package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078280 a(n) = A078279(n)/22.
 * @author Sean A. Irvine
 */
public class A078280 extends A078279 {

  @Override
  public Z next() {
    return super.next().divide(22);
  }
}

