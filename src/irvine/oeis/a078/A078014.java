package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078014.
 * @author Sean A. Irvine
 */
public class A078014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078014() {
    super(new long[] {-2, 0, 1}, new long[] {1, 0, 0});
  }
}
