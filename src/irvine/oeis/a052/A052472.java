package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052472.
 * @author Sean A. Irvine
 */
public class A052472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052472() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 10, 35, 84, 168});
  }
}
