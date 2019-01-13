package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132594.
 * @author Sean A. Irvine
 */
public class A132594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132594() {
    super(new long[] {1, -255, 255}, new long[] {0, 63, 16128});
  }
}
