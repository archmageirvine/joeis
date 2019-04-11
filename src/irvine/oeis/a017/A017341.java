package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017341 <code>a(n) = 10*n + 6</code>.
 * @author Sean A. Irvine
 */
public class A017341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017341() {
    super(new long[] {-1, 2}, new long[] {6, 16});
  }
}
