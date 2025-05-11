package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077195 extends A077194 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

