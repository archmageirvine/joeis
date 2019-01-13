package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228874.
 * @author Sean A. Irvine
 */
public class A228874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228874() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {24, 84, 924, 5544, 40194});
  }
}
