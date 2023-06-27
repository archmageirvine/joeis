package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166863 a(1)= 1; a(2)= 5; thereafter a(n)= a(n-1) + a(n-2) + 5.
 * @author Sean A. Irvine
 */
public class A166863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166863() {
    super(1, new long[] {-1, 0, 2}, new long[] {1, 5, 11});
  }
}
