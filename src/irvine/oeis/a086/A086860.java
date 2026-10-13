package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014092;

/**
 * A086860 Numbers in A086473 corresponding to the unique product of two numbers having the unique sum of A086533.
 * @author Sean A. Irvine
 */
public class A086860 extends A014092 {

  private final Sequence mS = new A086473();
  private long mA = mS.next().longValueExact();
  private final HashSet<Long> mSet = new HashSet<>();

  private boolean contains(final long k) {
    while (k >= mA) {
      mSet.add(mA);
      mA = mS.next().longValueExact();
    }
    return mSet.contains(k);
  }

  private long is(final long k) {
    int cnt = 0;
    long prod = 0;
    for (long x = 2; 2 * x <= k; ++x) {
      final long y = k - x;
      if (contains(x * y)) {
        if (++cnt > 1) {
          return 0;
        }
        prod = x * y;
      }
    }
    return cnt == 1 ? prod : 0;
  }

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      final long prod = is(k.longValueExact());
      if (prod != 0) {
        return Z.valueOf(prod);
      }
    }
  }
}

