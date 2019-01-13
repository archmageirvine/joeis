package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066983.
 * @author Sean A. Irvine
 */
public class A066983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066983() {
    super(new long[] {1, 2, 0}, new long[] {1, 1, 1});
  }
}
