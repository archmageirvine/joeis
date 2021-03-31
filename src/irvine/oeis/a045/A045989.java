package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045989 a(n) = A045954(n)/2.
 * @author Sean A. Irvine
 */
public class A045989 extends A045954 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
