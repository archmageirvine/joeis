package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052926.
 * @author Sean A. Irvine
 */
public class A052926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052926() {
    super(new long[] {-3, 1, 4}, new long[] {1, 1, 5});
  }
}
