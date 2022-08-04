package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058345 a(1) = 1; a(n+1) = lcm(Sum_{k=1..n} a(k), Product_{k=1..n} a(k)).
 * @author Sean A. Irvine
 */
public class A058345 implements Sequence {

  private Z mProd = Z.ONE;
  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    final Z t = mProd.lcm(mSum);
    mSum = mSum.add(t);
    mProd = mProd.multiply(t);
    return t;
  }
}

