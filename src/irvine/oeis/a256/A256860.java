package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256860.
 * @author Sean A. Irvine
 */
public class A256860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256860() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 7, 33, 119, 350, 882, 1974});
  }
}
