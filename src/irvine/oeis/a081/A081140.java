package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081140.
 * @author Sean A. Irvine
 */
public class A081140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081140() {
    super(new long[] {1000, -300, 30}, new long[] {0, 0, 1});
  }
}
