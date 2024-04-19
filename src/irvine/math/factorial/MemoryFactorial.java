package irvine.math.factorial;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Compute factorials and remember their values.
 * @author Sean A. Irvine
 */
public final class MemoryFactorial {

  /** Singleton instance. */
  public static final MemoryFactorial SINGLETON = new MemoryFactorial();

  /**
   * Convert a number into a list of digits in factorial base.
   * @param n number to convert
   * @return factorial base digits
   */
  public List<Z> factorialBaseList(final Z n) {
    int b = 1;
    while (Functions.FACTORIAL.z(b).compareTo(n) <= 0) {
      ++b;
    }
    final List<Z> res = new ArrayList<>();
    Z m = n;
    do {
      final int n1 = --b;
      final Z[] qr = m.divideAndRemainder(Functions.FACTORIAL.z(n1));
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
