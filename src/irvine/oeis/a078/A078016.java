package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078016.
 * @author Sean A. Irvine
 */
public class A078016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078016() {
    super(new long[] {-1, -1, 1}, new long[] {1, 0, -1});
  }
}
