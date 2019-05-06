package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020950 <code>a(n) = k-1</code>, where k is smallest number such that <code>A002487(k) =</code> n.
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
