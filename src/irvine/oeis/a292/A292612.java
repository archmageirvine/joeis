package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292612.
 * @author Sean A. Irvine
 */
public class A292612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292612() {
    super(new long[] {-1, 2, 2}, new long[] {4, -3, 5});
  }
}
