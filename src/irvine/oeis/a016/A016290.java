package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016290.
 * @author Sean A. Irvine
 */
public class A016290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016290() {
    super(new long[] {64, -56, 14}, new long[] {1, 14, 140});
  }
}
