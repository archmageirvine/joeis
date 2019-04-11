package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188165 <code>2^n + 9</code>.
 * @author Sean A. Irvine
 */
public class A188165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188165() {
    super(new long[] {-2, 3}, new long[] {10, 11});
  }
}
