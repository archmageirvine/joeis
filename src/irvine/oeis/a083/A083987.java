package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a051.A051883;

/**
 * A083987 <code>a(n) = n-th</code> partial concatenation of <code>A051883</code> divided by n.
 * @author Sean A. Irvine
 */
public class A083987 extends A051883 {

  @Override
  public Z next() {
    super.next();
    return mS.divide(mN);
  }
}

