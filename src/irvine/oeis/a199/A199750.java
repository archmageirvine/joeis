package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199750 <code>2*11^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199750() {
    super(new long[] {-11, 12}, new long[] {3, 23});
  }
}
