package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199421 (5*7^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199421() {
    super(new long[] {-7, 8}, new long[] {3, 18});
  }
}
