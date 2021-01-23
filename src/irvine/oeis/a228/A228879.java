package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228879 a(n+2) = 3*a(n), starting 4,7.
 * @author Sean A. Irvine
 */
public class A228879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228879() {
    super(new long[] {3, 0}, new long[] {4, 7});
  }
}
