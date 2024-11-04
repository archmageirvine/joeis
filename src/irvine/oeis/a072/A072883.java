package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a097.A097792;

/**
 * A072883 Least k &gt;= 1 such that k^n + n is prime, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A072883 extends Sequence1 {

  private final Sequence mReducible = new A097792().skip(); // skip 4
  private long mN = 0;
  private long mR = mReducible.next().longValueExact();

  @Override
  public Z next() {
    ++mN;
    if (mR == mN) {
      mR = mReducible.next().longValueExact();
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      if (Z.valueOf(++k).pow(mN).add(mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

