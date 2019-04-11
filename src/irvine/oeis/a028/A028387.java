package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028387 <code>a(n) = n + (n+1)^2</code>.
 * @author Sean A. Irvine
 */
public class A028387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028387() {
    super(new long[] {1, -3, 3}, new long[] {1, 5, 11});
  }
}
