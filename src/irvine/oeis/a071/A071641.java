package irvine.oeis.a071;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071641 a(n) defined by recursion in the formula section.
 * @author Sean A. Irvine
 */
public class A071641 extends Sequence0 {

  private int mN = -1;

  private final MemoryFunction1<Z> mF = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n < 4) {
        return Z.ONE;
      }
      final Z t = get(n - 1).add(get(n - 4));
      return t.add(t.divide(10));
    }
  };

  private long g(final int n) {
    return 9 - mF.get(n).mod(9);
  }

  @Override
  public Z next() {
    return Z.valueOf(10 - Functions.PRIME.l(g(++mN)) % 10);
  }
}
