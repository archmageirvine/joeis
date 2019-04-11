package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198857 <code>a(n) = 10*8^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A198857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198857() {
    super(new long[] {-8, 9}, new long[] {9, 79});
  }
}
