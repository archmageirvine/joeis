package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059839.
 * @author Sean A. Irvine
 */
public class A059839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059839() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 5, 341, 7381, 69905, 406901, 1727605, 5884901, 17043521});
  }
}
