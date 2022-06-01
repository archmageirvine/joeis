package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133141 Numbers which are both centered pentagonal (A005891) and centered hexagonal numbers (A003215).
 * @author Sean A. Irvine
 */
public class A133141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133141() {
    super(new long[] {1, -483, 483}, new long[] {1, 331, 159391});
  }
}
