package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069178 Centered 21-gonal numbers.
 * @author Sean A. Irvine
 */
public class A069178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069178() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 22, 64});
  }
}
