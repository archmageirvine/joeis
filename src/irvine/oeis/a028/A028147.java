package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028147.
 * @author Sean A. Irvine
 */
public class A028147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028147() {
    super(new long[] {-2464, 1500, -325, 30}, new long[] {1, 30, 575, 9000});
  }
}
