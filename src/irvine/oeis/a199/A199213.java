package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199213 <code>(3*5^n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A199213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199213() {
    super(new long[] {-5, 6}, new long[] {2, 8});
  }
}
