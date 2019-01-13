package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287816.
 * @author Sean A. Irvine
 */
public class A287816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287816() {
    super(new long[] {1, 19, -15, -11, 9}, new long[] {1, 9, 65, 471, 3413});
  }
}
