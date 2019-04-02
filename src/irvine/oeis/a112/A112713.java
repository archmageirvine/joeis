package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112713 Expansion of x/(1-x+x^5-x^6).
 * @author Sean A. Irvine
 */
public class A112713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112713() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {0, 1, 1, 1, 1, 1});
  }
}
