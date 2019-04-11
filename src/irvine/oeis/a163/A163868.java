package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163868 <code>a(n) = (4^n + 11)/3</code>.
 * @author Sean A. Irvine
 */
public class A163868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163868() {
    super(new long[] {-4, 5}, new long[] {4, 5});
  }
}
