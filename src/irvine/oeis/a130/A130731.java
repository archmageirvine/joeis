package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130731.
 * @author Sean A. Irvine
 */
public class A130731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130731() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 2, 0, 0});
  }
}
