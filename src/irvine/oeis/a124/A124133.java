package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124133 <code>a(n)=(-1/2)*sum_{i1+i2+i3=2n} ((2*n)!/(i1! i2! i3!))*B(i1)</code> where B are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A124133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124133() {
    super(new long[] {4, -9, 6}, new long[] {0, 5, 28});
  }
}
