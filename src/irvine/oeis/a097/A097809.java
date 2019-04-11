package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097809 <code>a(n) = 5*2^n-2*n-4</code>.
 * @author Sean A. Irvine
 */
public class A097809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097809() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 12});
  }
}
