package irvine.oeis.a036;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a007.A007053;

/**
 * A036378 Number of primes p between powers of 2, 2^n &lt; p &lt;= 2^(n+1).
 * @author Sean A. Irvine
 */
public class A036378 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036378() {
    super(new A007053());
  }
}
