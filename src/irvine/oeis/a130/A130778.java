package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130778.
 * @author Sean A. Irvine
 */
public class A130778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130778() {
    super(new long[] {1, -2, 2}, new long[] {1, -1, -3});
  }
}
