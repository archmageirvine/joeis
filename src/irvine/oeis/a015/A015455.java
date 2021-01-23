package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015455 a(n) = 9*a(n-1) + a(n-2) for n&gt;1; a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A015455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015455() {
    super(new long[] {1, 9}, new long[] {1, 1});
  }
}
