package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014092;

/**
 * A086533 Numbers in A014092 splittable into a sum of a single number pair (both distinct from 1) having a product that belongs to A086473.
 * @author Sean A. Irvine
 */
public class A086533 extends A014092 {

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

  private boolean is(final long k) {
    int cnt = 0;
    for (long x = 2; 2 * x <= k; ++x) {
      final long y = k - x;
      if (contains(x * y) && ++cnt > 1) {
        return false;
      }
    }
    return cnt == 1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      if (is(k.longValueExact())) {
        return k;
      }
    }
  }
}

