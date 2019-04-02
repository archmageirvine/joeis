package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014231 (Product of 3 successive Catalan numbers)/2.
 * @author Sean A. Irvine
 */
public class A014231 extends A014228 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
