package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229031.
 * @author Sean A. Irvine
 */
public class A229031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229031() {
    super(new long[] {-48, 20, 4}, new long[] {120, 0, 2400});
  }
}
