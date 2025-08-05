package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079224 Number of Catalan objects fixed by three-fold application of the Catalan bijections A057511/A057512 (Deep rotation of general parenthesizations/plane trees).
 * @author Sean A. Irvine
 */
public class A079224 extends A079216 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
