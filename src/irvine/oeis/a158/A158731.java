package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158731.
 * @author Sean A. Irvine
 */
public class A158731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158731() {
    super(new long[] {1, -3, 3}, new long[] {34, 1190, 4658});
  }
}
