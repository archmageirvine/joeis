package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079226 Number of Catalan objects fixed by five-fold application of the Catalan bijections A057511/A057512 (deep rotation of general parenthesizations/plane trees).
 * @author Sean A. Irvine
 */
public class A079226 extends A079216 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
