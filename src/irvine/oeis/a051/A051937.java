package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051937.
 * @author Sean A. Irvine
 */
public class A051937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051937() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 19, 38});
  }
}
