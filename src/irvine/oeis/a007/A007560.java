package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007560.
 * @author Sean A. Irvine
 */
public class A007560 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(null);
  }

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (k < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    final Z ak = mA.get(k.intValue());
    for (long j = 0; j <= n / k; ++j) {
      sum = sum.add(Binomial.binomial(ak, Z.valueOf(j)).multiply(get(n - k * j, k - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      mA.add(Z.valueOf(mN));
    } else {
      mA.add(get(mN - 2, mN - 2));
    }
    return mA.get(mA.size() - 1);
  }
}
