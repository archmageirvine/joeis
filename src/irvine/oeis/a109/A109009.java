package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109009 <code>a(n) =</code> GCD(n,5).
 * @author Sean A. Irvine
 */
public class A109009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109009() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {5, 1, 1, 1, 1});
  }
}
