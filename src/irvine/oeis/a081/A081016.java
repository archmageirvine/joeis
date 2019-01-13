package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081016.
 * @author Sean A. Irvine
 */
public class A081016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081016() {
    super(new long[] {1, -8, 8}, new long[] {1, 6, 40});
  }
}
