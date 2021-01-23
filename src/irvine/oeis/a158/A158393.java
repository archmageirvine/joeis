package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158393 676n - 1.
 * @author Sean A. Irvine
 */
public class A158393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158393() {
    super(new long[] {-1, 2}, new long[] {675, 1351});
  }
}
