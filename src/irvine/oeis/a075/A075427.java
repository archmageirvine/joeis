package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075427.
 * @author Sean A. Irvine
 */
public class A075427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075427() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 3, 6});
  }
}
