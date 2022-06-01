package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199487 9*7^n+1.
 * @author Sean A. Irvine
 */
public class A199487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199487() {
    super(new long[] {-7, 8}, new long[] {10, 64});
  }
}
