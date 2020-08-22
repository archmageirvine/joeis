package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024998;

/**
 * A026095 a(n) = Sum{T(k,k-1)}, k = 1,2,...,n, where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026095 extends A024998 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      super.next();
      return Z.ONE;
    }
    return super.next().add(3);
  }
}

