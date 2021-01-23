package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105281 a(0)=0; a(n)=6*a(n-1)+6.
 * @author Sean A. Irvine
 */
public class A105281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105281() {
    super(new long[] {-6, 7}, new long[] {0, 6});
  }
}
