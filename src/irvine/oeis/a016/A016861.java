package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016861 <code>a(n) = 5*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A016861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016861() {
    super(new long[] {-1, 2}, new long[] {1, 6});
  }
}
