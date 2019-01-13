package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048906.
 * @author Sean A. Irvine
 */
public class A048906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048906() {
    super(new long[] {1, -232323, 232323}, new long[] {1, 297045, 69010153345L});
  }
}
