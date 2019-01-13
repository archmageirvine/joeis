package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281863.
 * @author Sean A. Irvine
 */
public class A281863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281863() {
    super(new long[] {60, 0}, new long[] {1, 10});
  }
}
