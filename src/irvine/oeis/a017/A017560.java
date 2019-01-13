package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017560.
 * @author Sean A. Irvine
 */
public class A017560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017560() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 50625, 531441, 2313441, 6765201});
  }
}
