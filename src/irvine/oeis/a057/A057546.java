package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a079.A079216;

/**
 * A057546 Number of Catalan objects of size n fixed by Catalan Automorphism A057511/A057512 (deep rotation of general parenthesizations/plane trees).
 * @author Sean A. Irvine
 */
public class A057546 extends A079216 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : t(mN, 1);
  }
}
