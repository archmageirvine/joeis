package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016921 <code>a(n) = 6*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A016921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016921() {
    super(new long[] {-1, 2}, new long[] {1, 7});
  }
}
