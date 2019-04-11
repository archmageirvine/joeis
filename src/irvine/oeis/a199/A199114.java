package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199114 <code>11*3^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199114() {
    super(new long[] {-3, 4}, new long[] {12, 34});
  }
}
