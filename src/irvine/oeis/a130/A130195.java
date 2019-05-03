package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130195 Row sums of triangle <code>A130194</code>.
 * @author Sean A. Irvine
 */
public class A130195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130195() {
    super(new long[] {1, -1, 2, -2, 1}, new long[] {1, 3, 2, -2, -1});
  }
}
