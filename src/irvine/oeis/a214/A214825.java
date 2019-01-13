package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214825.
 * @author Sean A. Irvine
 */
public class A214825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214825() {
    super(new long[] {1, 1, 1}, new long[] {1, 3, 3});
  }
}
