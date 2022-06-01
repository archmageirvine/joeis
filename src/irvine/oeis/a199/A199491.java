package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199491 (11*7^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199491() {
    super(new long[] {-7, 8}, new long[] {6, 39});
  }
}
