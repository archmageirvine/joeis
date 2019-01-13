package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159750.
 * @author Sean A. Irvine
 */
public class A159750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159750() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {37, 47, 65, 157, 235, 353});
  }
}
