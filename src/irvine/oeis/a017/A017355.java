package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017355.
 * @author Sean A. Irvine
 */
public class A017355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017355() {
    super(new long[] {-1, 4, -6, 4}, new long[] {343, 4913, 19683, 50653});
  }
}
