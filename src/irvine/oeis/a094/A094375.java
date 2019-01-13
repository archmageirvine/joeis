package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094375.
 * @author Sean A. Irvine
 */
public class A094375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094375() {
    super(new long[] {24, -26, 9}, new long[] {1, 4, 15});
  }
}
