package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078032.
 * @author Sean A. Irvine
 */
public class A078032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078032() {
    super(new long[] {-1, -1, 0}, new long[] {1, -1, -1});
  }
}
