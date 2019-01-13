package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156812.
 * @author Sean A. Irvine
 */
public class A156812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156812() {
    super(new long[] {1, -3, 3}, new long[] {44, 70, 546});
  }
}
