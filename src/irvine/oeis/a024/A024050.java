package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024050 <code>a(n) = 5^n -</code> n.
 * @author Sean A. Irvine
 */
public class A024050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024050() {
    super(new long[] {5, -11, 7}, new long[] {1, 4, 23});
  }
}
