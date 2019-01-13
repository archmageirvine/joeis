package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192914.
 * @author Sean A. Irvine
 */
public class A192914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192914() {
    super(new long[] {-1, 2, 2}, new long[] {1, 0, 5});
  }
}
