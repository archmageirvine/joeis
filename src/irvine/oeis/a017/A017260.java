package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017260 a(n) = (9*n + 8)^4.
 * @author Sean A. Irvine
 */
public class A017260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017260() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4096, 83521, 456976, 1500625, 3748096});
  }
}
