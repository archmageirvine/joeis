package irvine.oeis.a000;

import irvine.math.z.Z;

import java.util.ArrayList;

/**
 * A000700.
 * @author Sean A. Irvine
 */
public class A000700 extends A000593 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final ArrayList<Z> mB = new ArrayList<>();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      mA.add(Z.ONE);
      return Z.ONE;
    }
    mB.add(super.next());
    if (mFirst || mN == 1) {
      mA.add(Z.ONE);
      return Z.ONE;
    }
    final int n = (int) mN;
    Z s = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      final Z t = mB.get(k).multiply(mA.get(n - 1 - k));
      s = s.signedAdd((k & 1) == 0, t);
    }
    s = s.divide(n);
    mA.add(s);
    return s;
  }
}

