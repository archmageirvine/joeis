package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111566 <code>a(n) = ((1+sqrt(8))*(2+sqrt(2))^n + (1-sqrt(8))*(2-sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A111566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111566() {
    super(new long[] {-2, 4}, new long[] {1, 6});
  }
}
