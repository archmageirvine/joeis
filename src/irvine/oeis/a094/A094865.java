package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094865.
 * @author Sean A. Irvine
 */
public class A094865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094865() {
    super(new long[] {-5, 20, -21, 8}, new long[] {0, 0, 0, 1});
  }
}
