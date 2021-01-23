package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020950 a(n) = k-1, where k is smallest number such that A002487(k) = n.
 * @author Sean A. Irvine
 */
public class A020950 extends A020946 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
