package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168309 Period <code>2</code>: repeat 4,-3.
 * @author Sean A. Irvine
 */
public class A168309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168309() {
    super(new long[] {1, 0}, new long[] {4, -3});
  }
}
