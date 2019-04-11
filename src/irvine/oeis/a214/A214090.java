package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214090 Period 6: repeat <code>[0, 0, 1, 0, 1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A214090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214090() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 0, 1, 0, 1, 1});
  }
}
