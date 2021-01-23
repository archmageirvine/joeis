package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199114 11*3^n+1.
 * @author Sean A. Irvine
 */
public class A199114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199114() {
    super(new long[] {-3, 4}, new long[] {12, 34});
  }
}
