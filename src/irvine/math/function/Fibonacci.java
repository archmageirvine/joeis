package irvine.math.function;

import java.util.LinkedHashMap;
import java.util.Map;

import irvine.math.z.Z;

/**
 * Fibonacci function.
 * @author Sean A. Irvine
 */
class Fibonacci extends AbstractFunction1 {

  private static final int SMALL_LIMIT = 100;
  private static final Z[] FIBONACCI = new Z[SMALL_LIMIT];

  static {
    // These cases explicitly initialized so that constants from Z used
    FIBONACCI[0] = Z.ZERO;
    FIBONACCI[1] = Z.ONE;
    FIBONACCI[2] = Z.ONE;
    FIBONACCI[3] = Z.TWO;
    FIBONACCI[4] = Z.THREE;
    FIBONACCI[5] = Z.FIVE;
    FIBONACCI[6] = Z.EIGHT;
    // Initialize remainder of small cases
    for (int k = 7; k < FIBONACCI.length; ++k) {
      FIBONACCI[k] = FIBONACCI[k - 1].add(FIBONACCI[k - 2]);
    }
  }

  /** Cache of recently requested values. */
  private static final Map<Long, Z> FIBO_MAP = new LinkedHashMap<>() {
    @Override
    protected boolean removeEldestEntry(final Map.Entry<Long, Z> eldest) {
      return size() > 100;
    }
  };

  @Override
  public Z z(long n) {
    // handle negatives
    if (n < 0) {
      n = -n;
      final Z r = z(n);
      return (n & 1) == 1 ? r : r.negate();
    }
    // handle small cases
    if (n < FIBONACCI.length) {
      return FIBONACCI[(int) n];
    }

    // examine cache
    final Long nn = n;
    final Z mapResult = FIBO_MAP.get(nn);
    if (mapResult != null) {
      return mapResult;
    }

    // handle even cases
    if ((n & 1) == 0) {
      n >>>= 1;
      final Z fnp = z(n + 1);
      final Z fnm = z(n - 1);
      final Z r = fnp.multiply(fnp).subtract(fnm.multiply(fnm));
      FIBO_MAP.put(nn, r);
      return r;
    }

    // handle odd cases
    n >>>= 1;
    final Z fnpo = z(n + 1);
    final Z fno = z(n);
    final Z ro = fnpo.multiply(fnpo).add(fno.multiply(fno));
    FIBO_MAP.put(nn, ro);
    return ro;
  }
}

