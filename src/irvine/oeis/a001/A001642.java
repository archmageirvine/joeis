package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001642.
 * @author Sean A. Irvine
 */
public class A001642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001642() {
    super(new long[] {1, 1, 0, 1, 1}, new long[] {1, 3, 4, 11, 21});
  }
}
