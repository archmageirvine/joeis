package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123720 <code>a(n) = 2^n + 2^(n-1) -</code> n.
 * @author Sean A. Irvine
 */
public class A123720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123720() {
    super(new long[] {2, -5, 4}, new long[] {2, 4, 9});
  }
}
