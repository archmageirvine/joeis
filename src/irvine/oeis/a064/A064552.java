package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A064552 a(0) = 1, a(n) = a(n-1) + 2*q(n) - n for n &gt; 0, where q(n) = A064657(n) = q(|n-q(n-3)|) + q(|n-q(n-4)|) for n &gt; 3, q(n) = 1 for n = 0, 1, 2, 3.
 * @author Sean A. Irvine
 */
public class A064552 extends Sequence0 {

  private final Sequence mQ = new A064657().skip(1);
  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z t = mQ.next();
      if (t == null) {
        return null;
      }
      mA = mA.add(t.multiply(2).subtract(++mN));
    }
    return mA;
  }
}

