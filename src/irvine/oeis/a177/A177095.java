package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177095 <code>9^n - 8</code>.
 * @author Sean A. Irvine
 */
public class A177095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177095() {
    super(new long[] {-9, 10}, new long[] {1, 73});
  }
}
