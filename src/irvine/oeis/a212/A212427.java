package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212427.
 * @author Sean A. Irvine
 */
public class A212427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212427() {
    super(new long[] {1, -3, 3}, new long[] {0, 17, 35});
  }
}
