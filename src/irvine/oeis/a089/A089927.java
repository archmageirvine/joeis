package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089927 Expansion of 1/((1-x^2)(1-5x+x^2)).
 * @author Sean A. Irvine
 */
public class A089927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089927() {
    super(new long[] {1, -5, 0, 5}, new long[] {1, 5, 25, 120});
  }
}
