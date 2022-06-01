package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046192 Octagonal hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A046192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046192() {
    super(new long[] {1, -9603, 9603}, new long[] {1, 11781, 113123361});
  }
}
