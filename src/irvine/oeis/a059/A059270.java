package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059270.
 * @author Sean A. Irvine
 */
public class A059270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059270() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 15, 42});
  }
}
