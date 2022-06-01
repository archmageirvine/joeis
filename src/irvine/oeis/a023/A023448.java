package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023448 n-6.
 * @author Sean A. Irvine
 */
public class A023448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023448() {
    super(new long[] {-1, 2}, new long[] {-6, -5});
  }
}
