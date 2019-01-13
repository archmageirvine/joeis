package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028028.
 * @author Sean A. Irvine
 */
public class A028028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028028() {
    super(new long[] {-540, 483, -155, 21}, new long[] {1, 21, 286, 3234});
  }
}
