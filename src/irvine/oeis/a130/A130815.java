package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130815.
 * @author Sean A. Irvine
 */
public class A130815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130815() {
    super(new long[] {-1, 1}, new long[] {1, 5});
  }
}
