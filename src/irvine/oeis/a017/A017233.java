package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017233 <code>a(n) = 9*n + 6</code>.
 * @author Sean A. Irvine
 */
public class A017233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017233() {
    super(new long[] {-1, 2}, new long[] {6, 15});
  }
}
