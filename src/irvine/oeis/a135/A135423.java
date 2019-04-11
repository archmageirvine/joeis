package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135423 <code>a(n) = (5*9^n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A135423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135423() {
    super(new long[] {-9, 10}, new long[] {3, 23});
  }
}
