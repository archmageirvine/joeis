package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103975.
 * @author Sean A. Irvine
 */
public class A103975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103975() {
    super(new long[] {1, -15, 15}, new long[] {16, 240, 3360});
  }
}
