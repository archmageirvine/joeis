package irvine.oeis.a058;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058921.
 * @author Sean A. Irvine
 */
public class A058924 implements Sequence {

  private int mN = 0;

  private static long delta1(final int n) {
    return n == 1 ? 1 : 0;
  }

  private final MemoryFunction1<Z> mA = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n <= 1) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n - 2, k -> Binomial.binomial(n - 1, k - 1).multiply(mB.get(k).add(mC.get(k)).add(delta1(k)).multiply(mA.get(n - k)))).multiply(n).divide(n - 1).add(mB.get(n - 1).add(mC.get(n - 1)).add(delta1(n - 1)).multiply(n));
    }
  };

  private final MemoryFunction1<Z> mB = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n <= 1) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, n - 2, k -> Binomial.binomial(n - 1, k - 1).multiply(mA.get(k).multiply(mB.get(n - k)).add(mA.get(k).multiply(mC.get(n - k))).add(mB.get(k).multiply(mB.get(n - k))))).multiply(n).divide(n - 1).add(mA.get(n - 1).multiply(n));
    }
  };

  private final MemoryFunction1<Z> mC = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n <= 1) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, n - 2, k -> Binomial.binomial(n - 1, k - 1).multiply(mB.get(k)).multiply(mC.get(n - k))).multiply(n).divide(n - 1).add(mB.get(n - 1).multiply(n));
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mA.get(mN).add(mB.get(mN));
  }
}
