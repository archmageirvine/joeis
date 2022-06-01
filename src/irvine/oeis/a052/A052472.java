package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052472 Number of independent components for a Weyl tensor in n dimensions.
 * @author Sean A. Irvine
 */
public class A052472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052472() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 10, 35, 84, 168});
  }
}
