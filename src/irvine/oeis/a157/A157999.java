package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157999.
 * @author Sean A. Irvine
 */
public class A157999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157999() {
    super(new long[] {-1, 2}, new long[] {337, 675});
  }
}
