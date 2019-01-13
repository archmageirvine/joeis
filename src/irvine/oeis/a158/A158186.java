package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158186.
 * @author Sean A. Irvine
 */
public class A158186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158186() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 27});
  }
}
