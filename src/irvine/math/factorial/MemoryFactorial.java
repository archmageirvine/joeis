package irvine.math.factorial;

import java.io.Serializable;

import irvine.math.MemoryFunction2;
import irvine.math.group.RingFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Compute factorials and remember their values.
 *
 * @author Sean A. Irvine
 */
public class MemoryFactorial extends MemoryFunction2<Integer, Z> implements Factorial, Serializable {

  private static final RingFactorial<Z> MF = RingFactorial.instance(Integers.SINGLETON);

  @Override
  public Z factorial(final int n) {
    return MF.factorial(n);
  }

  @Override
  public Z doubleFactorial(final int n) {
    if (n == -1) {
      return Z.ONE; // special case
    }
    return get(n, 2);
  }

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be nonnegative");
    }
    if (n <= m) {
      return Z.valueOf(n);
    }
    return get(n - m, m).multiply(n);
  }

  @Override
  public Z multiFactorial(final int n, final int m) {
    return get(n, m);
  }
}
