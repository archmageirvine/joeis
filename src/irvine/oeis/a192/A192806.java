package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192806.
 * @author Sean A. Irvine
 */
public class A192806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192806() {
    super(new long[] {1, -5, 7}, new long[] {1, 1, 4});
  }
}
