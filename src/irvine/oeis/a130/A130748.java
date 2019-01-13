package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130748.
 * @author Sean A. Irvine
 */
public class A130748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130748() {
    super(new long[] {-1, 4, -6, 4}, new long[] {17, 72, 190, 395});
  }
}
