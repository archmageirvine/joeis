package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038865 (n+3)^3 - n^3.
 * @author Sean A. Irvine
 */
public class A038865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038865() {
    super(1, new long[] {1, -3, 3}, new long[] {63, 117, 189});
  }
}
