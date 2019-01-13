package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157786.
 * @author Sean A. Irvine
 */
public class A157786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157786() {
    super(new long[] {1, -3, 3}, new long[] {14112, 80539, 201416});
  }
}
