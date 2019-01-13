package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127961.
 * @author Sean A. Irvine
 */
public class A127961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127961() {
    super(new long[] {-100, 101}, new long[] {1, 11});
  }
}
