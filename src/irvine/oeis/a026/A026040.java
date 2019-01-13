package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026040.
 * @author Sean A. Irvine
 */
public class A026040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026040() {
    super(new long[] {-1, 4, -6, 4}, new long[] {24, 40, 64, 98});
  }
}
