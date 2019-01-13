package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066982.
 * @author Sean A. Irvine
 */
public class A066982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066982() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 1, 3, 6});
  }
}
