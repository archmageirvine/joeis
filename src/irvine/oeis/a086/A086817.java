package irvine.oeis.a086;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086817 a(n) is the number of terms in the expansion of (x+y-z)*(x^2+y^2-z^2)*(x^3+y^3-z^3)*...*(x^n+y^n-z^n).
 * @author Sean A. Irvine
 */
public class A086817 extends Sequence0 {

  private int mN = -1;

  // Key packs the exponents of x and y into one long.
  // Value is the exact coefficient of x^a * y^b * z^c.
  private Map<Long, Z> mCoefficients = new HashMap<>();

  /** Construct the sequence. */
  public A086817() {
    mCoefficients.put(key(0, 0), Z.ONE);
  }

  private static long key(final int a, final int b) {
    return ((long) a << 32) | (b & 0xffffffffL);
  }

  private static int exponentX(final long key) {
    return (int) (key >>> 32);
  }

  private static int exponentY(final long key) {
    return (int) key;
  }

  private static void add(final Map<Long, Z> map, final int a, final int b, final Z value) {
    final long key = key(a, b);
    final Z old = map.get(key);
    final Z sum = old == null ? value : old.add(value);
    if (sum.equals(Z.ZERO)) {
      map.remove(key);
    } else {
      map.put(key, sum);
    }
  }

  // Multiply by x^k + y^k - z^k
  private void advance(final int k) {
    final Map<Long, Z> next = new HashMap<>(mCoefficients.size() * 2);
    for (final Map.Entry<Long, Z> entry : mCoefficients.entrySet()) {
      final long packed = entry.getKey();
      final int a = exponentX(packed);
      final int b = exponentY(packed);
      final Z coefficient = entry.getValue();
      // Choose x^k
      add(next, a + k, b, coefficient);
      // Choose y^k
      add(next, a, b + k, coefficient);
      // Choose -z^k
      add(next, a, b, coefficient.negate());
    }
    mCoefficients = next;
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      advance(mN);
    }
    return Z.valueOf(mCoefficients.size());
  }
}

