package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066375.
 * @author Sean A. Irvine
 */
public class A066375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066375() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 14, 40, 97});
  }
}
