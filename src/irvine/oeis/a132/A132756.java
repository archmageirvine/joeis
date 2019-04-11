package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132756 <code>a(n) = n*(n + 27)/2</code>.
 * @author Sean A. Irvine
 */
public class A132756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132756() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 29});
  }
}
