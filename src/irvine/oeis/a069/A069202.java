package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069202 A Collatz-Fibonacci mixture: a(1) = 1, a(2) = 2, a(n+2) = a(n+1)/2+a(n)/2 if a(n+1) and a(n) have the same parity, a(n+2) = a(n+1)+a(n) otherwise.
 * @author Sean A. Irvine
 */
public class A069202 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = mA.add(mB);
    mA = mB;
    if (t.isEven()) {
      mB = t.divide2();
    } else {
      mB = t;
    }
    return mB;
  }
}

