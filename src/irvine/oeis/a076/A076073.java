package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076073 a(n) = A076072(n)/n.
 * @author Sean A. Irvine
 */
public class A076073 extends A076072 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
