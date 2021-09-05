package irvine.math.padic;

import irvine.math.z.Z;

/**
 * Container for the p-adic expansion of a number.  These expansions are lazily
 * evaluated with terms computed on an as-needed basis.
 * @author Sean A. Irvine
 */
public interface PAdic {

  /**
   * Extract a specified digit of the p-adic expansion.
   * @param n index of digit
   * @return digit
   */
  long get(final int n);

  /**
   * The the prime associated with this expansion.
   * @return prime
   */
  long p();

  /**
   * Return the valuation of this number of -1 for 0.
   * @return valuation
   */
  int val();

  /**
   * Return a string representation of this number.
   * @param n precision
   * @return string
   */
  String toString(final int n);

  /**
   * Construct a p-adic number from an integer.
   * @param p prime
   * @param n number
   * @return p-adic number
   */
  static PAdic create(final long p, final long n) {
    return new PAdicZ(p, Z.valueOf(n));
  }

  /**
   * Construct a p-adic number from an integer.
   * @param p prime
   * @param n number
   * @return p-adic number
   */
  static PAdic create(final long p, final Z n) {
    return new PAdicZ(p, n);
  }

  /**
   * Construct a p-adic number from an explicit expansion.
   * @param p prime
   * @param n expansion
   * @return p-adic number
   */
  static PAdic create(final long p, final long... n) {
    return new FinitePAdic(p, n);
  }
}
