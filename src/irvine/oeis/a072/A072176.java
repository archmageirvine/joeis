package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072176 Unimodal analog of Fibonacci numbers: <code>a(n+1)=sum_k A071922(n-k,k)</code>.
 * @author Sean A. Irvine
 */
public class A072176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072176() {
    super(new long[] {1, -1, -2, 1, 2}, new long[] {1, 1, 2, 3, 5});
  }
}
