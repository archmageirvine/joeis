package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199762 (9*11^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199762() {
    super(new long[] {-11, 12}, new long[] {5, 50});
  }
}
