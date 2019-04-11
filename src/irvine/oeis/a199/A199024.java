package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199024 <code>6*11^n-1</code>.
 * @author Sean A. Irvine
 */
public class A199024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199024() {
    super(new long[] {-11, 12}, new long[] {5, 65});
  }
}
