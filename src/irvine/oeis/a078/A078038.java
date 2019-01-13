package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078038.
 * @author Sean A. Irvine
 */
public class A078038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078038() {
    super(new long[] {1, 2, -1}, new long[] {1, -2, 4});
  }
}
