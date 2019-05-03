package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133473 2 followed by numbers with <code>n-1 3</code>'s before 5.
 * @author Sean A. Irvine
 */
public class A133473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133473() {
    super(new long[] {-10, 11}, new long[] {2, 5});
  }
}
