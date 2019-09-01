package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A008348 <code>a(0)=0</code>; thereafter <code>a(n) = a(n-1) + prime(n)</code> if <code>a(n-1) &lt; prime(n)</code>, otherwise <code>a(n) = a(n-1) - prime(n)</code>.
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


