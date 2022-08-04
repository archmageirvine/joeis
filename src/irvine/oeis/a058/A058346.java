package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058346 a(1) = 1; a(n+1) = LCM( sum{k=1 to n}[a(k)], (product{k=1 to n}[a(k)])*(sum{k=1 to n}[1/a(k)]) ).
 * @author Sean A. Irvine
 */
public class A058346 implements Sequence {

  private Z mProd = Z.ONE;
  private Z mSum = null;
  private Q mRecip = Q.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    final Z t = mRecip.multiply(mProd).toZ().lcm(mSum);
    mSum = mSum.add(t);
    mProd = mProd.multiply(t);
    mRecip = mRecip.add(new Q(Z.ONE, t));
    return t;
  }
}

