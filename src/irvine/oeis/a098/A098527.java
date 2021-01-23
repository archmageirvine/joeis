package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098527 Expansion (1+x^3)/(1-x-x^7).
 * @author Sean A. Irvine
 */
public class A098527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098527() {
    super(new long[] {1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 2});
  }
}
