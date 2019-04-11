package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140960 <code>a(n) = (2*(-1)^n - 2^(n+1) + 3*n*2^n)/9</code>.
 * @author Sean A. Irvine
 */
public class A140960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140960() {
    super(new long[] {-4, 0, 3}, new long[] {0, 0, 2});
  }
}
