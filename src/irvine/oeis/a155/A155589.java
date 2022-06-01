package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155589 6^n+2^n-1.
 * @author Sean A. Irvine
 */
public class A155589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155589() {
    super(new long[] {12, -20, 9}, new long[] {1, 7, 39});
  }
}
