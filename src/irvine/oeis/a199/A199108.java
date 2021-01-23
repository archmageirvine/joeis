package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199108 4*3^n+1.
 * @author Sean A. Irvine
 */
public class A199108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199108() {
    super(new long[] {-3, 4}, new long[] {5, 13});
  }
}
