package irvine.math.z;

import java.util.HashMap;

/**
 * Compute Stirling numbers and associated Stirling numbers.
 * @author Sean A. Irvine
 */
public final class Stirling {

  private Stirling() { }

  private static final HashMap<String, Z> G_FIRST_KIND = new HashMap<>();
  private static final HashMap<String, Z> A_SECOND_KIND = new HashMap<>();

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

