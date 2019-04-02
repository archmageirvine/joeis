package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198966 a(n) = 8*9^n-1.
 * @author Sean A. Irvine
 */
public class A198966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198966() {
    super(new long[] {-9, 10}, new long[] {7, 71});
  }
}
