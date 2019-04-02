package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030267 COMPOSE natural numbers with themselves.
 * @author Sean A. Irvine
 */
public class A030267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030267() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 4, 14, 46});
  }
}
