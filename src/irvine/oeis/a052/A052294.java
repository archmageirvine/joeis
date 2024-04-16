package irvine.oeis.a052;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052294 Pernicious numbers: numbers with a prime number of 1's in their binary expansion.
 * @author Sean A. Irvine
 */
public class A052294 extends A000040 {

  private final TreeSet<Long> mA = new TreeSet<>();
  {
    // handle 2 now to avoid empty check later
    super.next(); // 2
    mA.add(3L);
  }
  private long mNext = (1L << super.next().intValueExact()) - 1;

  @Override
  public Z next() {
    while (mA.first() > mNext) {
      mA.add(mNext);
      mNext = (1L << super.next().intValueExact()) - 1;
    }
    final long res = mA.pollFirst();
    mA.add(Functions.SWIZZLE.l(res));
    return Z.valueOf(res);
  }
}
