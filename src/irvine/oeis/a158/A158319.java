package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158319 <code>441n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158319() {
    super(new long[] {-1, 2}, new long[] {440, 881});
  }
}
