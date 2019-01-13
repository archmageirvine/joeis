package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083225.
 * @author Sean A. Irvine
 */
public class A083225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083225() {
    super(new long[] {64, 0}, new long[] {1, 6});
  }
}
