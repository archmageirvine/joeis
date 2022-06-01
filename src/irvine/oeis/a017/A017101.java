package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017101 a(n) = 8n + 3.
 * @author Sean A. Irvine
 */
public class A017101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017101() {
    super(new long[] {-1, 2}, new long[] {3, 11});
  }
}
