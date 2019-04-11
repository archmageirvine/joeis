package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109008 <code>a(n) =</code> GCD(n,4).
 * @author Sean A. Irvine
 */
public class A109008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109008() {
    super(new long[] {1, 0, 0, 0}, new long[] {4, 1, 2, 1});
  }
}
