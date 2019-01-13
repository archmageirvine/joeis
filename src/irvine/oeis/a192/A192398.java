package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192398.
 * @author Sean A. Irvine
 */
public class A192398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192398() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 34, 153, 436, 985});
  }
}
