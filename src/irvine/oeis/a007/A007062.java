package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007062.
 * @author Sean A. Irvine
 */
public class A007062 extends MemoryFunction2<Integer, Integer> implements Sequence {

  @Override
  protected Integer compute(final Integer n, final Integer m) {
    if (n == 0) {
      return m;
    }
    return get(n - 1, n * (m / n) + n - m % n);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 0) + 1);
  }
}
