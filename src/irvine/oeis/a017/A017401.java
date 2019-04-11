package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017401 <code>a(n) = 11n + 1</code>.
 * @author Sean A. Irvine
 */
public class A017401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017401() {
    super(new long[] {-1, 2}, new long[] {1, 12});
  }
}
