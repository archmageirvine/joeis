package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158563.
 * @author Sean A. Irvine
 */
public class A158563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158563() {
    super(new long[] {1, -3, 3}, new long[] {31, 127, 287});
  }
}
