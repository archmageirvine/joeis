package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046183 Octagonal triangular numbers.
 * @author Sean A. Irvine
 */
public class A046183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046183() {
    super(new long[] {1, -1, -9602, 9602, 1}, new long[] {1, 21, 11781, 203841, 113123361});
  }
}
