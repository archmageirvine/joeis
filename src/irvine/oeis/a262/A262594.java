package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262594.
 * @author Sean A. Irvine
 */
public class A262594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262594() {
    super(new long[] {4, -17, 28, -22, 8}, new long[] {1, 4, 14, 52, 203});
  }
}
