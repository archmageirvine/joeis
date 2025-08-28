package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079805 Final term of n-th group in A079802.
 * @author Sean A. Irvine
 */
public class A079805 extends A079802 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mP);
  }
}

