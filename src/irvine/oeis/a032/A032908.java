package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032908.
 * @author Sean A. Irvine
 */
public class A032908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032908() {
    super(new long[] {1, -4, 4}, new long[] {2, 2, 3});
  }
}
