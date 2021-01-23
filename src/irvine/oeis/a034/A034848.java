package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034848 a(n) = 1 + 3*A034782(n).
 * @author Sean A. Irvine
 */
public class A034848 extends A034782 {

  @Override
  public Z next() {
    return super.next().multiply(3).add(1);
  }
}
