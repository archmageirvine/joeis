package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066280.
 * @author Sean A. Irvine
 */
public class A066280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066280() {
    super(new long[] {6, -11, 6}, new long[] {5, 12, 32});
  }
}
