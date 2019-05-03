package irvine.oeis.a008;

/**
 * A008471 Exactly 3 out of <code>10m+1, 10m+3, 10m+7, 10m+9</code> are primes.
 * @author Sean A. Irvine
 */
public class A008471 extends A008470 {

  @Override
  protected boolean accept(final int c) {
    return c == 3;
  }
}
