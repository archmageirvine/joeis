package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066104.
 * @author Sean A. Irvine
 */
public class A066104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066104() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 4, 2, 8});
  }
}
