package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158638.
 * @author Sean A. Irvine
 */
public class A158638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158638() {
    super(new long[] {1, -3, 3}, new long[] {1, 49, 193});
  }
}
