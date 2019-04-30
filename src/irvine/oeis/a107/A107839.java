package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107839 <code>a(n) = 5a(n-1) - 2a(n-2); a(0)=1, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A107839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107839() {
    super(new long[] {-2, 5}, new long[] {1, 5});
  }
}
