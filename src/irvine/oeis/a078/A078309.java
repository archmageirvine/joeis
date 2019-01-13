package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078309.
 * @author Sean A. Irvine
 */
public class A078309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078309() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 7, 11});
  }
}
