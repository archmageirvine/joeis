package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120775.
 * @author Sean A. Irvine
 */
public class A120775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120775() {
    super(new long[] {1, 5, 3}, new long[] {1, 6, 23});
  }
}
