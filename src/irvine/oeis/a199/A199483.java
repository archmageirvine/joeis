package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199483 <code>6*7^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199483() {
    super(new long[] {-7, 8}, new long[] {7, 43});
  }
}
