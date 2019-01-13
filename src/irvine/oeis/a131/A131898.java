package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131898.
 * @author Sean A. Irvine
 */
public class A131898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131898() {
    super(new long[] {2, -5, 4}, new long[] {1, 5, 11});
  }
}
