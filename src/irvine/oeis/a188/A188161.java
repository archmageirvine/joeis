package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188161 2*4^n + 3.
 * @author Sean A. Irvine
 */
public class A188161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188161() {
    super(new long[] {-4, 5}, new long[] {5, 11});
  }
}
