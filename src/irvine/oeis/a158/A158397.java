package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158397 <code>729n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158397() {
    super(new long[] {-1, 2}, new long[] {730, 1459});
  }
}
