package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023482 n-40.
 * @author Sean A. Irvine
 */
public class A023482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023482() {
    super(new long[] {-1, 2}, new long[] {-40, -39});
  }
}
