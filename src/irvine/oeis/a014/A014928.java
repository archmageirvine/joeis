package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014928 <code>a(1)=1, a(n)=n*13^(n-1)+a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A014928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014928() {
    super(new long[] {169, -195, 27}, new long[] {1, 27, 534});
  }
}
