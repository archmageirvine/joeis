package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277091 <code>a(n) = ((1 + sqrt(15))^n - (1 - sqrt(15))^n)/sqrt(15)</code>.
 * @author Sean A. Irvine
 */
public class A277091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277091() {
    super(new long[] {14, 2}, new long[] {0, 2});
  }
}
