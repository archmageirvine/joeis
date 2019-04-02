package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193910 Leap centuries in the revised Julian calendar.
 * @author Sean A. Irvine
 */
public class A193910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193910() {
    super(new long[] {-1, 1, 1}, new long[] {2, 6, 11});
  }
}
