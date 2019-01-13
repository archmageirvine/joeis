package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051926.
 * @author Sean A. Irvine
 */
public class A051926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051926() {
    super(new long[] {-1, 1, 5}, new long[] {1, 7, 35});
  }
}
