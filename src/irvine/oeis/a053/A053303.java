package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053303 Length of maximal prime gap p_{k+1} - p_k with starting prime p_k &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A053303 extends A053302 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).subtract(p);
  }
}

