package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042910.
 * @author Sean A. Irvine
 */
public class A042910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042910() {
    super(new long[] {-1, 0, 0, 0, 754, 0, 0, 0}, new long[] {31, 63, 157, 377, 23531, 47439, 118409, 284257});
  }
}
