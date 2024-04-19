package irvine.oeis.a028;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A028338 Triangle of coefficients in expansion of (x+1)*(x+3)*...*(x + 2n - 1) in rising powers of x.
 * @author Sean A. Irvine
 */
public class A028338 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A028338() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A028338(final int offset) {
    super(offset);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    if (m == 0) {
      return Functions.MULTIFACTORIAL.z(2 * n - 1);
    }
    return get(n - 1, m).multiply(2L * n - 1).add(get(n - 1, m - 1));
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
