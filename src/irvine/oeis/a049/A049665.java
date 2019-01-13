package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049665.
 * @author Sean A. Irvine
 */
public class A049665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049665() {
    super(new long[] {1, -19, 19}, new long[] {0, 13, 246});
  }
}
