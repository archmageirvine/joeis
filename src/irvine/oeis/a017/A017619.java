package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017619.
 * @author Sean A. Irvine
 */
public class A017619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017619() {
    super(new long[] {-1, 4, -6, 4}, new long[] {512, 8000, 32768, 85184});
  }
}
