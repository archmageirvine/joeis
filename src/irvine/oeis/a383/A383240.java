package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A383240 Rectangular array read by antidiagonals where row n contains the numbers of the form prime(n)*m^2, where prime(n) does not divide m.
 * @author Sean A. Irvine
 */
public class A383240 extends Sequence1 {

  private final DynamicLongArray mM = new DynamicLongArray();
  private int mN = 0;
  private int mK = 0;

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
      mM.set(mN, 1L);
      return Functions.PRIME.z(mN);
    }
    final long p = Functions.PRIME.l(mK);
    long m = mM.get(mK);
    while (++m % p == 0) {
      // do nothing
    }
    mM.set(mK, m);
    return Z.valueOf(m).square().multiply(p);
  }
}

