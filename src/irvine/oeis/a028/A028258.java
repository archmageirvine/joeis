package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028258.
 * @author Sean A. Irvine
 */
public class A028258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028258() {
    super(new long[] {-1024, 960, -280, 30}, new long[] {1, 30, 620, 11160});
  }
}
