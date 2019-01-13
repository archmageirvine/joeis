package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123478.
 * @author Sean A. Irvine
 */
public class A123478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123478() {
    super(new long[] {1, -255, 255}, new long[] {48, 12240, 3108960});
  }
}
