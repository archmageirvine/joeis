package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114965 <code>n^2 + 34</code>.
 * @author Sean A. Irvine
 */
public class A114965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114965() {
    super(new long[] {1, -3, 3}, new long[] {35, 38, 43});
  }
}
