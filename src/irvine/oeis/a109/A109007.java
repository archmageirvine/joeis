package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109007 <code>a(n) =</code> gcd(n,3).
 * @author Sean A. Irvine
 */
public class A109007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109007() {
    super(new long[] {1, 0, 0}, new long[] {3, 1, 1});
  }
}
