package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281699.
 * @author Sean A. Irvine
 */
public class A281699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281699() {
    super(new long[] {8, -14, 7}, new long[] {14, 50, 218});
  }
}
