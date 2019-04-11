package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161727 <code>a(n) = ((2+sqrt(3))*(4+sqrt(3))^n-(2-sqrt(3))*(4-sqrt(3))^n)/sqrt(12)</code>.
 * @author Sean A. Irvine
 */
public class A161727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161727() {
    super(new long[] {-13, 8}, new long[] {1, 6});
  }
}
