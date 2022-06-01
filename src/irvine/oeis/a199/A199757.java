package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199757 (7*11^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199757() {
    super(new long[] {-11, 12}, new long[] {4, 39});
  }
}
