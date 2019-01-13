package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130806.
 * @author Sean A. Irvine
 */
public class A130806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130806() {
    super(new long[] {-1, 1}, new long[] {1, 4});
  }
}
