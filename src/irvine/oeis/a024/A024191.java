package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024191 [ (3rd elementary symmetric function of 3,4,...,n+4)/(3+4+...+n+4) ].
 * @author Sean A. Irvine
 */
public class A024191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024191() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {5, 19, 47, 95, 170});
  }
}
