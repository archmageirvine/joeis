package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049662.
 * @author Sean A. Irvine
 */
public class A049662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049662() {
    super(new long[] {1, -19, 19}, new long[] {0, 5, 94});
  }
}
