package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059570.
 * @author Sean A. Irvine
 */
public class A059570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059570() {
    super(new long[] {-4, 0, 3}, new long[] {1, 2, 6});
  }
}
