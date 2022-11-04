package irvine.factor;

import irvine.math.z.Z;

/**
 * Routines relating to Smarandache numbers.
 * @author Sean A. Irvine
 */
public final class Smarandache {

  /** Prevent instantiation. */
  private Smarandache() { }

  /**
   * Return the nth Smarandache number as a string.  Sm(n) is the
   * number formed by the base 10 concatenation of 1 to n inclusive.
   *
   * @param n number
   * @return Sm(n)
   * @exception IllegalArgumentException if <code>n</code> is nonpositive.
   */
  public static String smarandache(final int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("Bad n");
    }
    final StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= n; ++i) {
      sb.append(i);
    }
    return sb.toString();
  }


  /**
   * Return the nth Smarandache number as an integer.  Sm(n) is the
   * number formed by the base 10 concatenation of 1 to n inclusive.
   *
   * @param n number
   * @return Sm(n)
   * @exception IllegalArgumentException if <code>n</code> is nonpositive.
   */
  public static Z smarandacheZ(final int n) {
    return new Z(smarandache(n));
  }


  /**
   * Maximum Smarandache number handled.  This value cannot be changed
   * without modifying the implementation of <code>isSmarandache</code>.
   */
  public static final int SMARANDACHE_LIMIT = 5000;
  /** Concatenation of numbers up to 1000. */
  private static final String SMCAT = smarandache(SMARANDACHE_LIMIT);
  /** Length of above. */
  private static final int SMCATL = SMCAT.length();
  private static final int MAX_BIT_LENGTH = new Z(SMCAT).bitLength();

  /**
   * Test if a number is a Smarandache number. If it is then return
   * its index, otherwise return 0.  Beyond <code>SMARANDACHE_LIMIT</code>
   * this method will always report 0 even if the number is in fact
   * a Smarandache number.
   *
   * @param n number to test
   * @return Smarandache index or 0.
   */
  public static int isSmarandache(final Z n) {
    // because n.toString() can be expensive, do some quick tests first
    if (n.signum() <= 0 || n.bitLength() > MAX_BIT_LENGTH) {
      return 0;
    }
    final String s = n.toString();
    if (!SMCAT.startsWith(s)) {
      return 0;
    }
    // At this point the number is highly likely to be Smarandache, but
    // there are exceptions like 1234567891.  Care must be taken to
    // weed out these cases where the boundary is wrong. The other
    // remaining task is to work out the index.
    int slen = s.length();
    if (slen == SMCATL) {
      return SMARANDACHE_LIMIT;
    }
    if (slen < 10) {
      // one digit index
      return slen;
    }
    slen -= 9;
    if (slen < 180) {
      // two digit index
      return (slen & 1) != 0 ? 0 : 9 + (slen >>> 1);
    }
    slen -= 180;
    if (slen < 2700) {
      // three digit index
      return slen % 3 != 0 ? 0 : 99 + slen / 3;
    }
    slen -= 2700;
    // four digit index
    return slen % 4 != 0 ? 0 : 999 + slen / 4;
  }

  /**
   * Return the nth reversed Smarandache number as a string.  <code>rSm(n)</code> is the
   * number formed by the base 10 concatenation of n down to 1 inclusive.
   *
   * @param n number
   * @return <code>rSm(n)</code>
   * @exception IllegalArgumentException if <code>n</code> is nonpositive.
   */
  public static String reverseSmarandache(final int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("Bad n");
    }
    final StringBuilder sb = new StringBuilder();
    for (int i = n; i > 0; --i) {
      sb.append(i);
    }
    return sb.toString();
  }


  /**
   * Return the nth reversed Smarandache number as an integer.  <code>rSm(n)</code> is the
   * number formed by the base 10 concatenation of n down to 1 inclusive.
   *
   * @param n number
   * @return <code>rSm(n)</code>
   * @exception IllegalArgumentException if <code>n</code> is nonpositive.
   */
  public static Z reverseSmarandacheZ(final int n) {
    return new Z(reverseSmarandache(n));
  }

  /** Reversed concatenation of numbers up to 1000. */
  private static final String RSMCAT = reverseSmarandache(SMARANDACHE_LIMIT);
  /** Length of above. */
  private static final int RSMCATL = RSMCAT.length();
  private static final int RMAX_BIT_LENGTH = new Z(RSMCAT).bitLength();

  /**
   * Test if a number is a reversed Smarandache number. If it is then return
   * its index, otherwise return 0.  Beyond <code>SMARANDACHE_LIMIT</code>
   * this method will always report 0 even if the number is in fact
   * a reversed Smarandache number.
   *
   * @param n number to test
   * @return reverse Smarandache index or 0.
   */
  public static int isReverseSmarandache(final Z n) {
    // because n.toString() can be expensive, do some quick tests first
    if (n.signum() <= 0 || n.bitLength() > RMAX_BIT_LENGTH) {
      return 0;
    }
    final String s = n.toString();
    if (!RSMCAT.endsWith(s)) {
      return 0;
    }
    // At this point the number is highly likely to be rSm, but
    // there are exceptions like 1987654321.  Care must be taken to
    // weed out these cases where the boundary is wrong. The other
    // remaining task is to work out the index.
    int slen = s.length();
    if (slen == RSMCATL) {
      return SMARANDACHE_LIMIT;
    }
    if (slen < 11) { // 10 also works here
      // one digit index
      return slen;
    }
    slen -= 9;
    if (slen < 180) {
      // two digit index
      return (slen & 1) != 0 ? 0 : 9 + (slen >>> 1);
    }
    slen -= 180;
    if (slen < 2700) {
      // three digit index
      return slen % 3 != 0 ? 0 : 99 + slen / 3;
    }
    slen -= 2700;
    // four digit index
    return slen % 4 != 0 ? 0 : 999 + slen / 4;
  }


  /**
   * Noddy main.
   * @param args arguments
   */
  public static void main(final String[] args) {
    System.out.println(smarandache(Integer.parseInt(args[0])));
    System.out.println(reverseSmarandache(Integer.parseInt(args[0])));
  }

}

