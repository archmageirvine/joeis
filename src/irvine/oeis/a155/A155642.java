package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155642 9^n - 5^n + 1.
 * @author Sean A. Irvine
 */
public class A155642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155642() {
    super(new long[] {45, -59, 15}, new long[] {1, 5, 57});
  }
}
