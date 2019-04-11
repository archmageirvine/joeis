package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166122 <code>a(n) = (7-(-5)^n)/6</code>.
 * @author Sean A. Irvine
 */
public class A166122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166122() {
    super(new long[] {5, -4}, new long[] {1, 2});
  }
}
