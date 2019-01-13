package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075528.
 * @author Sean A. Irvine
 */
public class A075528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075528() {
    super(new long[] {1, -35, 35}, new long[] {0, 3, 105});
  }
}
