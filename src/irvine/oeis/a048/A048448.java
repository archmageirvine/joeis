package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048448 a(n) = prime(n-1) + prime(n+1) (assuming prime(i) = 0 for i &lt; 1).
 * @author Sean A. Irvine
 */
public class A048448 extends A000040 {

  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mB;
    mB = mC;
    mC = super.next();
    return a.add(mC);
  }
}
