package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128865.
 * @author Sean A. Irvine
 */
public class A128865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128865() {
    super(new long[] {-64, 120, -70, 15}, new long[] {4, 108, 1372, 13500});
  }
}
