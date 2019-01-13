package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016633.
 * @author Sean A. Irvine
 */
public class A016633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016633() {
    super(new long[] {264, -178, 25}, new long[] {1, 25, 447});
  }
}
