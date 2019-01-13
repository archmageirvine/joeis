package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159690.
 * @author Sean A. Irvine
 */
public class A159690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159690() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {841, 881, 925, 4121, 4405, 4709});
  }
}
