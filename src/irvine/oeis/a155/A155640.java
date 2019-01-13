package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155640.
 * @author Sean A. Irvine
 */
public class A155640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155640() {
    super(new long[] {35, -47, 13}, new long[] {1, 3, 25});
  }
}
