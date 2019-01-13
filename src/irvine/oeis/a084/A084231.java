package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084231.
 * @author Sean A. Irvine
 */
public class A084231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084231() {
    super(new long[] {1, -195, 195}, new long[] {1, 337, 65521});
  }
}
