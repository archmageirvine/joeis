package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066455.
 * @author Sean A. Irvine
 */
public class A066455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066455() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 8, 25, 65});
  }
}
