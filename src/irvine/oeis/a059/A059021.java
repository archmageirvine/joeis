package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059021.
 * @author Sean A. Irvine
 */
public class A059021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059021() {
    super(new long[] {1, -9, 16, -3, -22, 35, -26, 9}, new long[] {0, 6, 40, 218, 1126, 5726, 28992, 146642});
  }
}
