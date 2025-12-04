package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A082312 Half the difference between start and center prime of the smallest [2n+1]-balanced prime set (A082080).
 * @author Sean A. Irvine
 */
public class A082312 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mA = new A082080().skip();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z p = mA.next();
    Z q = p;
    for (int k = 0; k < mN; ++k) {
      q = mPrime.prevPrime(q);
    }
    return p.subtract(q).divide2();
  }
}
