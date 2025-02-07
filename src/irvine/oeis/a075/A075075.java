package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075075 a(1) = 1, a(2) = 2 and then the smallest number not occurring earlier such that every term divides the product of its neighbors: a(n-1)*a(n+1)/a(n) is an integer.
 * @author Sean A. Irvine
 */
public class A075075 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mUsed.add(Z.ONE);
        mA = Z.ONE;
        return Z.ONE;
      }
      mUsed.add(Z.TWO);
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z d = Functions.GCD.z(mA, mB);
    final Z g = mB.divide(d);
    Z t = g;
    while (!mUsed.add(t)) {
      t = t.add(g);
    }
    mA = mB;
    mB = t;
    return t;
  }
}

