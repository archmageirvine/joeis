package irvine.oeis.a010;

import irvine.math.MemoryFunction2;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010048.
 * @author Sean A. Irvine
 */
public class A010048 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0 || k.equals(n)) {
      return Z.ONE;
    }
    return get(n - 1, k - 1).multiply(Fibonacci.fibonacci(n - k - 1)).add(get(n - 1, k).multiply(Fibonacci.fibonacci(k + 1)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}

