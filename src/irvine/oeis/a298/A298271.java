package irvine.oeis.a298;

import irvine.oeis.LinearRecurrence;

/**
 * A298271.
 * @author Sean A. Irvine
 */
public class A298271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A298271() {
    super(new long[] {1, -323, 323}, new long[] {0, 1, 323});
  }
}
