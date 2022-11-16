package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052006 Numbers k for which Fibonacci(k) is the first member of a 1,1 pair (A052005).
 * @author Sean A. Irvine
 */
public class A052006 extends A052005 {

  {
    setOffset(0);
  }

  private Z mA = super.next();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(mA);
      final Z t = mA;
      mA = super.next();
      if (t.equals(Z.ONE) && mA.equals(Z.ONE)) {
        return mSum;
      }
    }
  }
}

