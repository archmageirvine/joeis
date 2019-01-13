package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275908.
 * @author Sean A. Irvine
 */
public class A275908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275908() {
    super(new long[] {1, 5, 7, 7, 6, 1, 3}, new long[] {1, 5, 20, 75, 288, 1105, 4234});
  }
}
