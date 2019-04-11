package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017281 <code>a(n) = 10*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A017281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017281() {
    super(new long[] {-1, 2}, new long[] {1, 11});
  }
}
