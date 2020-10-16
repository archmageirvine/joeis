package irvine.math.z;

import java.util.HashMap;

/**
 * Compute Stirling numbers and associated Stirling numbers.
 * @author Sean A. Irvine
 */
public final class Stirling {

  private Stirling() { }

  private static final HashMap<String, Z> FIRST_KIND = new HashMap<>();
  private static final HashMap<String, Z> G_FIRST_KIND = new HashMap<>();
  private static final HashMap<String, Z> SECOND_KIND = new HashMap<>();
  private static final HashMap<String, Z> A_FIRST_KIND = new HashMap<>();
  private static final HashMap<String, Z> A_SECOND_KIND = new HashMap<>();
  static {
    A_FIRST_KIND.put("1_1", Z.ZERO);
  }

  /**
   * Compute Stirling numbers of the first kind.
   * Uses cached recursion.
   *
   * @param n upper index
   * @param m lower index
   * @return Stirling number of the first kind
   */
  public static Z firstKind(final long n, final long m) {
    if (n < 0 || m < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    if (m == 0) {
      return Z.ZERO;
    }
    final String key = n + "_" + m;
    final Z s = FIRST_KIND.get(key);
    if (s != null) {
      return s;
    }
    final Z r = firstKind(n - 1, m - 1).subtract(firstKind(n - 1, m).multiply(n - 1));
    FIRST_KIND.put(key, r);
    return r;
  }

  /**
   * Compute generalized Stirling numbers of the first kind.
   * Uses cached recursion.
   *
   * @param l leading index
   * @param n upper index
   * @param m lower index
   * @return Stirling number of the first kind
   */
  public static Z generalizedFirstKind(final long l, final long n, final long m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (n == 0) {
      return Z.ZERO;
    }
    final String key = l + "_" + n + "_" + m;
    final Z s = G_FIRST_KIND.get(key);
    if (s != null) {
      return s;
    }
    final Z r = generalizedFirstKind(l, n - 1, m).subtract(generalizedFirstKind(l, n - 1, m - 1).multiply(l + n - 1));
    G_FIRST_KIND.put(key, r);
    return r;
  }


  /**
   * Compute Stirling numbers of the second kind.
   * Uses cached recursion.
   *
   * @param n upper index
   * @param m lower index
   * @return Stirling number of the second kind
   */
  public static Z secondKind(final long n, final long m) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (m < 0) {
      return Z.ZERO;
    }
    if (n == m) {
      return Z.ONE;
    }
    if (n == 0 || m == 0 || n < m) {
      return Z.ZERO;
    }
    final String key = n + "_" + m;
    final Z s = SECOND_KIND.get(key);
    if (s != null) {
      return s;
    }
    final Z r = secondKind(n - 1, m - 1).add(secondKind(n - 1, m).multiply(m));
    SECOND_KIND.put(key, r);
    return r;
  }

  /**
   * Return the associated Stirling number of the first kind.
   * Uses cached recursion.
   *
   * @param n upper index
   * @param m lower index
   * @return associated Stirling number of the first kind
   */
  public static Z associatedFirstKind(final long n, final long m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (m == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    final String key = n + "_" + m;
    final Z d = A_FIRST_KIND.get(key);
    if (d != null) {
      return d;
    }
    final long a = n - 1;
    final Z r = associatedFirstKind(a, m).add(associatedFirstKind(a - 1, m - 1))
      .multiply(a);
    A_FIRST_KIND.put(key, r);
    return r;
  }

  /**
   * Return the associated Stirling number of the second kind.
   * Uses cached recursion.
   *
   * @param r association level
   * @param n upper index
   * @param m lower index
   * @return <code>r</code>-associated Stirling number of the second kind
   */
  public static Z associatedSecondKind(final int r, final long n, final long m) {
    // NB: This implementation might not have correct boundary conditions for all r
    if (n < 0 || m < 0) {
      return Z.ZERO;
    }
    if (m == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    final String key = r + "_" + n + "_" + m;
    final Z d = A_SECOND_KIND.get(key);
    if (d != null) {
      return d;
    }
    final Z z = associatedSecondKind(r, n - 1, m).multiply(m)
      .add(associatedSecondKind(r, n - r, m - 1).multiply(Binomial.binomial(n - 1, r - 1)));
    A_SECOND_KIND.put(key, z);
    return z;
  }
}

