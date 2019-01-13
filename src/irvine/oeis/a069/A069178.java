package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069178.
 * @author Sean A. Irvine
 */
public class A069178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069178() {
    super(new long[] {1, -3, 3}, new long[] {1, 22, 64});
  }
}
