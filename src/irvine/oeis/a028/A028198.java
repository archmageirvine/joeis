package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028198.
 * @author Sean A. Irvine
 */
public class A028198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028198() {
    super(new long[] {-5940, 2883, -499, 37}, new long[] {1, 37, 870, 16610});
  }
}
