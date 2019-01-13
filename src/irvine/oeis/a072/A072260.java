package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072260.
 * @author Sean A. Irvine
 */
public class A072260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072260() {
    super(new long[] {16, -24, 9}, new long[] {6, 33, 165});
  }
}
