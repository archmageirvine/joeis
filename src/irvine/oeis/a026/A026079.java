package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a025.A025179;

/**
 * A026079 <code>a(n) = Sum_{k = 1..n} T(k,k-1)</code>, where T is the array defined in <code>A024996</code>.
 * @author Sean A. Irvine
 */
public class A026079 extends A025179 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().add(2);
  }
}

