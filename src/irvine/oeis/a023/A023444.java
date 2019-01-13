package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023444.
 * @author Sean A. Irvine
 */
public class A023444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023444() {
    super(new long[] {-1, 2}, new long[] {-2, -1});
  }
}
