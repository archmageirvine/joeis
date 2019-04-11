package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155612 <code>7^n - 3^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A155612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155612() {
    super(new long[] {21, -31, 11}, new long[] {1, 5, 41});
  }
}
