package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066374.
 * @author Sean A. Irvine
 */
public class A066374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066374() {
    super(new long[] {-4, 12, -13, 6}, new long[] {2, 8, 25, 67});
  }
}
