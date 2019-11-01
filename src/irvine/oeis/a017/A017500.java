package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017500 <code>a(n) = (11*n + 9)^4</code>.
 * @author Sean A. Irvine
 */
public class A017500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017500() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6561, 160000, 923521, 3111696, 7890481});
  }
}
