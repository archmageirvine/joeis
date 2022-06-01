package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005667 Numerators of continued fraction convergents to sqrt(10).
 * @author Sean A. Irvine
 */
public class A005667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005667() {
    super(new long[] {1, 6}, new long[] {1, 3});
  }
}

