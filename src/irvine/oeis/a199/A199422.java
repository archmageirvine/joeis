package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199422 <code>5*7^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199422() {
    super(new long[] {-7, 8}, new long[] {6, 36});
  }
}
