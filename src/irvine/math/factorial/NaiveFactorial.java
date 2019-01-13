package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Compute factorial by direct multiplication.
 *
 * @author Sean A. Irvine
 */
public class NaiveFactorial implements Factorial {

  @Override
  public Z factorial(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be nonnegative");
    }
    Z r = Z.ONE;
    for (int k = 2; k <= n; ++k) {
      r = r.multiply(Z.valueOf(k));
    }
    return r;
  }

  @Override
  public Z doubleFactorial(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be nonnegative");
    }
    Z r = Z.ONE;
    for (int k = n; k > 1; k -= 2) {
      r = r.multiply(Z.valueOf(k));
    }
    return r;
  }

  /**
   * Print factorial of the argument.
   * @param args number
   */
  public static void main(final String[] args) {
    System.out.println(new NaiveFactorial().factorial(Integer.parseInt(args[0])));
  }
}
