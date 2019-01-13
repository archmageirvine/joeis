package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072711.
 * @author Sean A. Irvine
 */
public class A072711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072711() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {11, 29, 31, 32, 38, 49, 52, 58, 71});
  }
}
