package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199686 6*10^n+1.
 * @author Sean A. Irvine
 */
public class A199686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199686() {
    super(new long[] {-10, 11}, new long[] {7, 61});
  }
}
