package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017653 <code>a(n) = 12*n + 11</code>.
 * @author Sean A. Irvine
 */
public class A017653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017653() {
    super(new long[] {-1, 2}, new long[] {11, 23});
  }
}
