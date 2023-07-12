package irvine.oeis.a059;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059418 Triangle T(n,k) arising from enumeration of permutations with ordered orbits, read by rows (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A059418 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A059418() {
    super(1);
  }

  private int mN = 0;
  private int mM = 1;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == m) {
      return Z.ONE;
    }
    if (m == 1) {
      return MemoryFactorial.SINGLETON.factorial(n).divide2();
    }
    return get(n - 1, m).multiply(n - 2).add(get(n - 1, m - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
