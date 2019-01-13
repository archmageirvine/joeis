package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014717.
 * @author Sean A. Irvine
 */
public class A014717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014717() {
    super(new long[] {-1, 2, 2}, new long[] {9, 4, 25});
  }
}
