package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229611.
 * @author Sean A. Irvine
 */
public class A229611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229611() {
    super(new long[] {-11, 34, -36, 14}, new long[] {1, 14, 160, 1770});
  }
}
