package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199414 10*6^n+1.
 * @author Sean A. Irvine
 */
public class A199414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199414() {
    super(new long[] {-6, 7}, new long[] {11, 61});
  }
}
