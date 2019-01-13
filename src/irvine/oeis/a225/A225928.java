package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225928.
 * @author Sean A. Irvine
 */
public class A225928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225928() {
    super(new long[] {64, -84, 21}, new long[] {29, 113, 1169});
  }
}
