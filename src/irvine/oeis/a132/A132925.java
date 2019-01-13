package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132925.
 * @author Sean A. Irvine
 */
public class A132925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132925() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 4, 10, 21});
  }
}
