package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024437.
 * @author Sean A. Irvine
 */
public class A024437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024437() {
    super(new long[] {-504, 695, -215, 25}, new long[] {1, 25, 410, 5570});
  }
}
