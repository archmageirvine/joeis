package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199419 <code>4*7^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199419() {
    super(new long[] {-7, 8}, new long[] {5, 29});
  }
}
