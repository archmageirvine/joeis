package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A008348 <code>a(0)=0, a(n) = a(n-1) +</code> prime(n) if <code>a(n-1) &lt;</code> prime(n) else <code>a(n-1) -</code> prime(n).
 * @author Sean A. Irvine
 */
public class A008348 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      final Z t = super.next();
      mA = mA.signedAdd(mA.compareTo(t) < 0, t);
    }
    return mA;
  }
}


