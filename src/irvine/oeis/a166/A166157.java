package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166157 <code>a(n) = (8^n+16*(-9)^n)/17</code>.
 * @author Sean A. Irvine
 */
public class A166157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166157() {
    super(new long[] {72, -1}, new long[] {1, -8});
  }
}
