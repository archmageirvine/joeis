package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034662 Sum of n-th powers of divisors of 20.
 * @author Sean A. Irvine
 */
public class A034662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034662() {
    super(new long[] {-8000, 16800, -12180, 3948, -609, 42}, new long[] {6, 42, 546, 9198, 170898, 3304182});
  }
}
