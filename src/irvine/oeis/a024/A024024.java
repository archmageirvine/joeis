package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024024 <code>a(n) = 3^n -</code> n.
 * @author Sean A. Irvine
 */
public class A024024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024024() {
    super(new long[] {3, -7, 5}, new long[] {1, 2, 7});
  }
}
