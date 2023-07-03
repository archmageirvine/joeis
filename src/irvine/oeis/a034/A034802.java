package irvine.oeis.a034;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;

/**
 * A034802 Triangle of Fibonomial coefficients (k=3).
 * @author Sean A. Irvine
 */
public class A034802 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0 || k.equals(n)) {
      return Z.ONE;
    }
    return get(n - 1, k - 1).multiply(Fibonacci.fibonacci(3 * (n - k) - 1)).add(get(n - 1, k).multiply(Fibonacci.fibonacci(3 * k + 1)));
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

