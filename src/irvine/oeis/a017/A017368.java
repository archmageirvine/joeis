package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017368 <code>a(n) = (10*n + 8)^4</code>.
 * @author Sean A. Irvine
 */
public class A017368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017368() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4096, 104976, 614656, 2085136, 5308416});
  }
}
