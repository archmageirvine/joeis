package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081337 <code>(8^n+4^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A081337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081337() {
    super(new long[] {-32, 12}, new long[] {1, 6});
  }
}
