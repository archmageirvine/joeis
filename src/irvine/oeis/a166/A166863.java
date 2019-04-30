package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166863 <code>a(1)= 1; a(2)= 5</code>; thereafter <code>a(n)= a(n-1) + a(n-2) + 5</code>.
 * @author Sean A. Irvine
 */
public class A166863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166863() {
    super(new long[] {-1, 0, 2}, new long[] {1, 5, 11});
  }
}
