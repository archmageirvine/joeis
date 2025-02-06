package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074968 a(n) = minimal m such that Sum_{k=1..m+1} prime(k) &gt; prime(n) * prime(m+1).
 * @author Sean A. Irvine
 */
public class A074968 extends A000040 {

  private long mM = 0;
  private long mQ = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    while (mSum.compareTo(p.multiply(mQ)) <= 0) {
      ++mM;
      mQ = mPrime.nextPrime(mQ);
      mSum = mSum.add(mQ);
    }
    return Z.valueOf(mM - 1);
  }
}
