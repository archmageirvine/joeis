package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199752 3*11^n+1.
 * @author Sean A. Irvine
 */
public class A199752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199752() {
    super(new long[] {-11, 12}, new long[] {4, 34});
  }
}
