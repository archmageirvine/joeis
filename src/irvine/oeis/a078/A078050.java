package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078050.
 * @author Sean A. Irvine
 */
public class A078050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078050() {
    super(new long[] {-2, -1}, new long[] {1, -2});
  }
}
