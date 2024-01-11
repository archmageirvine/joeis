package irvine.math.factorial;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import irvine.math.MemoryFunction2;
import irvine.math.group.RingFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Compute factorials and remember their values.
 * @author Sean A. Irvine
 */
public final class MemoryFactorial extends MemoryFunction2<Integer, Z> implements Factorial, Serializable {

  /** Singleton instance. */
  public static final MemoryFactorial SINGLETON = new MemoryFactorial();
  private static final RingFactorial<Z> MF = RingFactorial.instance(Integers.SINGLETON);

  /** Users should use SINGLETON. */
  private MemoryFactorial() {
  }

  @Override
  public Z factorial(final int n) {
    return MF.factorial(n);
  }

  /**
   * Compute the factorial function. Given <code>n</code> return
   * <code>n</code>!.
   * @param n a non-negative integer
   * @return <code>n</code>!
   * @exception IllegalArgumentException if <code>n</code> &lt; 0.
   * @exception ArithmeticException if <code>n</code> is too large for this implementation.
   */
  public Z factorial(final Z n) {
    return MF.factorial(n.intValueExact());
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
      return Z.valueOf(Math.max(n, 1));
    }
    return get(n - m, m).multiply(n);
  }

  @Override
  public Z multiFactorial(final int n, final int m) {
    return get(n, m);
  }

  /**
   * Convert a number into a list of digits in factorial base.
   * @param n number to convert
   * @return factorial base digits
   */
  public List<Z> factorialBaseList(final Z n) {
    int b = 1;
    while (factorial(b).compareTo(n) <= 0) {
      ++b;
    }
    final List<Z> res = new ArrayList<>();
    Z m = n;
    do {
      final Z[] qr = m.divideAndRemainder(factorial(--b));
      res.add(qr[0]);
      m = qr[1];
    } while (b > 1);
    return res;
  }

  /**
   * Convert a number into factorial base.
   * @param n number to convert
   * @return factorial base representation
   */
  public Z factorialBase(final Z n) {
    Z res = Z.ZERO;
    for (final Z t : factorialBaseList(n)) {
      if (t.compareTo(Z.TEN) >= 0) {
        throw new RuntimeException("Expansion resulted in value >= 10");
      }
      res = res.multiply(10).add(t);
    }
    return res;
  }
}
