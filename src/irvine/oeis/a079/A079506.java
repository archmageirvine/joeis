package irvine.oeis.a079;

import irvine.oeis.FilterSequence;
import irvine.oeis.a074.A074776;

/**
 * A079506 Numbers k with gcd(2^k-1, Fibonacci(k)) &gt; 1 and not divisible by 2 or 11. Odd members of A074776 not divisible by 11.
 * @author Sean A. Irvine
 */
public class A079506 extends FilterSequence {

  /** Construct the sequence. */
  public A079506() {
    super(1, new A074776(), k -> k.isOdd() && k.mod(11) != 0);
  }
}
