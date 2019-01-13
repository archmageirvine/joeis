package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094195.
 * @author Sean A. Irvine
 */
public class A094195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094195() {
    super(new long[] {5, -11, 7}, new long[] {1, 3, 10});
  }
}
