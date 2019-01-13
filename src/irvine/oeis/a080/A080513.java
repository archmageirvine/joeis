package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080513.
 * @author Sean A. Irvine
 */
public class A080513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080513() {
    super(new long[] {-1, 1, 1}, new long[] {1, 2, 2});
  }
}
