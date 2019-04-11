package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166539 <code> a(n) = (10*n + 7*(-1)^n + 5)/4</code>.
 * @author Sean A. Irvine
 */
public class A166539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166539() {
    super(new long[] {-1, 1, 1}, new long[] {2, 8, 7});
  }
}
