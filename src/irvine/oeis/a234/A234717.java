package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234717 a(n) = floor(n/(exp(1/(2*n))-1)).
 * @author Sean A. Irvine
 */
public class A234717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234717() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 7, 16, 30});
  }
}
