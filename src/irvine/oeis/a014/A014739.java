package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014739.
 * @author Sean A. Irvine
 */
public class A014739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014739() {
    super(new long[] {-1, 0, 2}, new long[] {1, 2, 5});
  }
}
