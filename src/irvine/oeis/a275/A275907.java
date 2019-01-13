package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275907.
 * @author Sean A. Irvine
 */
public class A275907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275907() {
    super(new long[] {1, 1, 0, 0, 4}, new long[] {1, 5, 20, 79, 317});
  }
}
