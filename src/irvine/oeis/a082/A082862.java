package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033844;

/**
 * A082862 Prime(2^j) where j are the positions at which (prime(2^k+1)-prime(2^k))/log(prime(2^k)) set low-value records.
 * @author Sean A. Irvine
 */
public class A082862 extends Sequence1 {

  private CR mBest = CR.TEN;
  private final A033844 mA = new A033844();

  @Override
  public Z next() {
    while (true) {
      final Z p = mA.next();
      final Z q = Functions.NEXT_PRIME.z(p);
      final CR v = CR.valueOf(q.subtract(p)).divide(CR.valueOf(p).log());
      if (v.compareTo(mBest) < 0) {
        mBest = v;
        return p;
      }
    }
  }
}
