package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027057 a(n) = (1/2) * A027052(n, 2n-1).
 * @author Sean A. Irvine
 */
public class A027057 extends A027056 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
