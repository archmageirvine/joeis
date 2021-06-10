package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124610 a(n) = 5*a(n-1) + 2*a(n-2), n &gt; 1; a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A124610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124610() {
    super(new long[] {2, 5}, new long[] {1, 1});
  }
}
