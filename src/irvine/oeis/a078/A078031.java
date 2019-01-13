package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078031.
 * @author Sean A. Irvine
 */
public class A078031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078031() {
    super(new long[] {1, -1, 0}, new long[] {1, -1, -1});
  }
}
