package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059599 Expansion of (3+x)/(1-x)^6.
 * @author Sean A. Irvine
 */
public class A059599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059599() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3, 19, 69, 189, 434, 882});
  }
}
