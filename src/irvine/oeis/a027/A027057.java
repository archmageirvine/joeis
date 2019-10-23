package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027057 <code>(1/2)*T(n,2n-1)</code>, T given by <code>A027052</code>.
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
