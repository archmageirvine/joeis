package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076623 Total number of left truncatable primes (without zeros) in base n.
 * @author Sean A. Irvine
 */
public class A076623 extends Sequence2 {

  private long mBase = 1;
  private long mCount = 0;

  private void search(final Z n, final Z m) {
    for (long k = 1; k < mBase; ++k) {
      final Z t = m.multiply(k).add(n);
      if (t.isProbablePrime()) {
        ++mCount;
        search(t, m.multiply(mBase));
      }
    }
  }

  @Override
  public Z next() {
    ++mBase;
    mCount = 0;
    search(Z.ZERO, Z.ONE);
    return Z.valueOf(mCount);
  }
}
