package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022725.
 * @author Sean A. Irvine
 */
public class A022725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022725() {
    super(new long[] {-480, 676, -221, 26}, new long[] {1, 26, 455, 6760});
  }
}
