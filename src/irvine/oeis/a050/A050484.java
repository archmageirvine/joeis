package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050484 Partial sums of A051946.
 * @author Sean A. Irvine
 */
public class A050484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050484() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 12, 68, 264, 810, 2112, 4884, 10296});
  }
}
