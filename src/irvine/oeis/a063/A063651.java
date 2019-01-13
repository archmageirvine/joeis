package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063651.
 * @author Sean A. Irvine
 */
public class A063651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063651() {
    super(new long[] {-32, -42, 116, 85, -138, -17, 30, 3}, new long[] {1, 1, 21, 85, 747, 4375, 31387, 202841});
  }
}
