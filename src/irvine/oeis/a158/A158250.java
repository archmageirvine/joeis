package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158250.
 * @author Sean A. Irvine
 */
public class A158250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158250() {
    super(new long[] {-1, 2}, new long[] {255, 511});
  }
}
