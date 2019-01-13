package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060867.
 * @author Sean A. Irvine
 */
public class A060867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060867() {
    super(new long[] {8, -14, 7}, new long[] {1, 9, 49});
  }
}
