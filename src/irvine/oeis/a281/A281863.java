package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281863 Alternating powers of 60 and 10 times powers of 60.
 * @author Sean A. Irvine
 */
public class A281863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281863() {
    super(new long[] {60, 0}, new long[] {1, 10});
  }
}
