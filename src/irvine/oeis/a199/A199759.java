package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199759 <code>8*11^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199759() {
    super(new long[] {-11, 12}, new long[] {9, 89});
  }
}
