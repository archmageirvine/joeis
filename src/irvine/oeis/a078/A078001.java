package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078001.
 * @author Sean A. Irvine
 */
public class A078001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078001() {
    super(new long[] {-1, -1, 2}, new long[] {1, 1, 1});
  }
}
